package Tools;


import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;                  
//Packages JDBC standard
import java.math.*;               
//BigDecimal et BigInteger classes.
import oracle.jdbc.*; 
//Extensions Oracle à JDBC. (optionnel)
import oracle.jdbc.pool.*;
//OracleDataSource
import oracle.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeremygillet
 */
public class ConnectBDD {
    private Connection myConnexion;
    private Statement myStatement;
    
    private final String MYURL = "jdbc:oracle:thin:@//192.168.24.3/pfpbs";
    private final String MYUSER= "gp1";
    private final String MYPASSWORD= "gp1";
    
    
    public ConnectBDD(){
        if (testDriver()) {
            try {
                myConnexion = DriverManager.getConnection(MYURL, MYUSER, MYPASSWORD);
                myStatement = myConnexion.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectBDD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        }
        else
        {
            System.out.println("testdriver false");
        }

    }

    public boolean testDriver() {
        //   Chargement du driver JDBC pour MySQL */
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return true;
        } catch (ClassNotFoundException e) {
            System.out.println("Le driver n'a pas été chargé");
            return false;
        }
    
    }
    
public Connection getMyConnexion() {
        return myConnexion;
    }

    public Statement getMyStatement() {
        return myStatement;
    }
    
    
     public void close() {
        try {
            this.myStatement.close();
            this.myConnexion.close();    
        } catch (SQLException ex) {
           System.out.println("Mysql connection fermeture failed !!!");
        }
    }
     
     
    
}

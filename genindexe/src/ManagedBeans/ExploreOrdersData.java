/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import Tools.ConnectBDD;
import beans.Orders;
import beans.Samples;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * @author Michel
 */
public class ExploreOrdersData {
    
    int Id_Com;
    
    public Integer NB_NAnalyse(Integer id_Com) {
        
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        int Nb_A=0;
        
        try{
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps = con.prepareStatement("select count(*) as nb from ECHANTILLON natural join TUBE natural join ANALYSE where ID_COMANDE =" +id_Com+" and RES_FINAL is NULL");
            ResultSet result = ps.executeQuery();
            
             
        while (result.next()) {
                Nb_A = result.getInt("nb");     
        }
            
            b.close();
        }
        
        catch(SQLException ex) {
            System.out.println("select count(*) as nb from ECHANTILLON natural join TUBE natural join ANALYSE where ID_COMANDE =" +id_Com+" and RES_FINAL is NULL");
            System.out.println("SQLException saveOrder " + ex.getMessage());
            System.out.println("SQLState saveOrder: " + ex.getSQLState());
            System.out.println("VendorError saveOrder: " + ex.getErrorCode());
            b.close();
        }
        
        return Nb_A;
        
    }

    public Integer NB_Analyse(Integer id_Com) {
        
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        int Nb_A=0;
        
        try{
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps = con.prepareStatement("select count(*) as nb from ECHANTILLON natural join TUBE natural join ANALYSE where ID_COMANDE =" +id_Com+" and RES_FINAL is not NULL");
            ps.setInt(1, Id_Com);
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
                Nb_A = result.getInt("nb");     
        }
            
            b.close();
        }
        
        catch(SQLException ex) {
            System.out.println("select count(*) as nb from ECHANTILLON natural join TUBE natural join ANALYSE where ID_COMANDE =" +id_Com+" and RES_FINAL is not NULL");
            System.out.println("SQLException saveOrder " + ex.getMessage());
            System.out.println("SQLState saveOrder: " + ex.getSQLState());
            System.out.println("VendorError saveOrder: " + ex.getErrorCode());
            b.close();
        }
        
        return Nb_A;
    }
    

}

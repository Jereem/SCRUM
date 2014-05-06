
import Tools.ConnectBDD;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeremygillet
 */
public class Test {
  public static void main(String[] args){
      
      
        ConnectBDD b = new ConnectBDD();

        try {

         /* Exécution d'une requête de modification de la BD (INSERT, UPDATE, DELETE, CREATE, etc.). */
         b.getMyStatement().executeQuery("SELECT * FROM ARC");
         
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
      
      
      
      
  }      
        
        
        }
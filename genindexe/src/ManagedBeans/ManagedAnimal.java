/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import Tools.ConnectBDD;
import Tools.DateTools;
import beans.Animals;
import beans.Species;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Teddy
 */
public class ManagedAnimal {
    private Animals selectedAnimal;

    private ConnectBDD b;
    private Connection con;

    public ManagedAnimal() {
        // Bouml preserved body begin 00043002
        b = new ConnectBDD();
        con = b.getMyConnexion();

        // Bouml preserved body end 00043002
    }
    
    public String saveAnimal(Animals animal, int idClient, String pSpe) {
        Species paramSpe = new Species(pSpe);
        DateTools d = new DateTools();
        try {
        PreparedStatement ps0 = con.prepareStatement("select * from ESPECE where NOM_CATEGORIE = '" + pSpe + "'");
        ResultSet result0 = ps0.executeQuery();
        while (result0.next()) {
            paramSpe.setID(result0.getInt("ID_ESPECE"));
        }
            Statement state = b.getMyStatement();
            
            String query = "Insert Into ANIMAL(NOM_ANIMAL, DATE_NAISSANCE, SEXE, ID_ESPECE, ID_CLIENT) Values(" + animal.getNom() + ", " + d.dateJavaToSQL(animal.getNumberBirthday()) + ", " + animal.getSexe() + ", " + paramSpe.getID() + ", " + idClient +")";
                state.executeUpdate(query, state.RETURN_GENERATED_KEYS);
                ResultSet clefs = state.getGeneratedKeys();
                System.out.println(clefs.getObject(1));
                return "success";
        } catch (SQLException ex) {
            System.out.println("Insert Into ANIMAL(NOM_ANIMAL, DATE_NAISSANCE, SEXE, ID_ESPECE, ID_CLIENT) Values(" + animal.getNom() + ", " + d.dateJavaToSQL(animal.getNumberBirthday()) + ", " + animal.getSexe() + ", " + paramSpe.getID() + ", " + idClient +")");
            System.out.println("SQLException saveAnimal: " + ex.getMessage());
            System.out.println("SQLState saveAnimal: " + ex.getSQLState());
            System.out.println("VendorError saveAnimal: " + ex.getErrorCode());
            return "failed";
        }
    }
    
    /**
     * Methode qui renvoie une Jlist contenant les catégories existante dans la BDD
     * @return 
     */
    public JList getJListEspeces() {
        JList jList = new JList();
        DefaultListModel dlm = new DefaultListModel();
        try{
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from ESPECE");
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Species pSpecie = new Species();
            pSpecie.setNameSpecie(result.getString("NOM_ESPECE"));
            dlm.addElement(pSpecie.getNameSpecie());
        }
        jList.setModel(dlm);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return (jList);
    }
}

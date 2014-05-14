/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import Tools.ConnectBDD;
import beans.Samples;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Michel
 */
public class TypeEchData {
    
        public JList getJlistTypeEchantillon() {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        JList jList = new JList();
        DefaultListModel dlm = new DefaultListModel();
        try{
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from TYPE_ECHANTILLON");
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Samples pSample = new Samples();
            pSample.setType(result.getString("TYPE_ECH"));
            dlm.addElement(pSample.getType());
        }
        jList.setModel(dlm);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        b.close();
        return (jList);
    }
    
}

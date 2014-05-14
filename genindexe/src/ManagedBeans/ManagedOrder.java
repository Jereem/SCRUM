package ManagedBeans;

import Tools.ConnectBDD;
import beans.Customers;
import beans.Orders;
import beans.Samples;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Teddy
 */
public class ManagedOrder {

    private Orders selectedOrder;
    private ManagedSample myManagedSample;

    public ManagedOrder() {
    }

    public ManagedOrder(Orders selectedOrder) {
        this.selectedOrder = selectedOrder;
    }

    public Orders getSelectedOrder() {
        return selectedOrder;
    }

    public void setSelectedOrder(Orders selectedOrder) {
        this.selectedOrder = selectedOrder;
    }

    /**
     * This function permits to list all the orders in the database.
     */
    public List<Orders> getListOrder() {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        List<Orders> list = new ArrayList<Orders>();
        try {
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps;
            ps = con.prepareStatement("select * from COMMANDE");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Orders pOrder = new Orders();
                pOrder.setIdOrder(result.getInt("ID_COMMANDE"));
                list.add(this.selectedOrder);
            }
        }
        catch (SQLException ex) {
            System.out.println("ma requete");
            System.out.println("SQLException checkAnimal " + ex.getMessage());
            System.out.println("SQLState checkAnimal: " + ex.getSQLState());
            System.out.println("VendorError checkAnimal: " + ex.getErrorCode());
        }
        b.close();
        return (list);
    }

    /**
     * This function permits to search the order in the database that have the
     * customer in parameter.
     */
    public Orders searchOrder(Customers customer) {
        return (this.selectedOrder);
    }

    /**
     * This function permits to search the order in the database that has this
     * id.
     */
    public Orders searchOrder(int id) {
        return (this.selectedOrder);
    }

    /**
     * This function permits to save in the database the order in parameter.
     * @param order
     */
    public String saveOrder(Orders order) {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        String sendRes = "failed";
        this.selectedOrder = order;
        try{
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps = b.prepareStatement("INSERT INTO Commande(DATE_COMMANDE, DELAI_RAPIDE) VALUES (?,?)");
            ps.setDate(1, (java.sql.Date) this.selectedOrder.getDateOrder());
            ps.setInt(2, this.selectedOrder.getPriorityLevel());
            int statut = ps.executeUpdate();
            b.close();
            sendRes = "success";
        }
        catch(SQLException ex) {
            System.out.println("ma requete");
            System.out.println("SQLException checkAnimal " + ex.getMessage());
            System.out.println("SQLState checkAnimal: " + ex.getSQLState());
            System.out.println("VendorError checkAnimal: " + ex.getErrorCode());
            b.close();
        sendRes = "failed";
        }
        if ("success".equals(sendRes)){
            this.selectedOrder.setIdOrder(searchLastId());
        for(int i = 0; i < this.selectedOrder.getSamples().size(); i++)
    {
        this.myManagedSample = new ManagedSample(this.selectedOrder.getSamples().get(i));
        sendRes = myManagedSample.saveSample(myManagedSample.getSelectedSample(), this.selectedOrder.getDateOrder(), this.selectedOrder.getIdOrder()) ;
    }
    }
        return sendRes;
    }
    
    public int searchLastId() {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        int resultID = 0;
        try {
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps;
            ps = con.prepareStatement("select ID_COMMANDE from COMMANDE order by ID_COMMANDE");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                resultID = (result.getInt("ID_TYPE_ECHANTILLON"));
            }
        } catch (SQLException ex) {
            System.out.println("ma requete");
            System.out.println("SQLException checkAnimal " + ex.getMessage());
            System.out.println("SQLState checkAnimal: " + ex.getSQLState());
            System.out.println("VendorError checkAnimal: " + ex.getErrorCode());
            b.close();
        }
        return resultID;
    }
}

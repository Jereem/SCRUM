package ManagedBeans;

import beans.Customers;
import beans.Orders;

/**
 *
 * @author Teddy
 */
public class ManagedOrder {
    
    
    /**
     * This function permits to list all the orders in the database.
     */
//  public List<Orders> getListOrder() throws SQLException {
//    // Bouml preserved body begin 0003D002
//	  List<Orders> list = new ArrayList<Orders>();
//          if (con == null) {
//            throw new SQLException("Can't get database connection");
//        }
//        PreparedStatement ps;
//        ps = con.prepareStatement("select * from ");
//        //get customer data from database
//        ResultSet result = ps.executeQuery();
//        while (result.next()) {
//            Orders pOrder = new Orders();
//            pOrder.setPaid(result.getString("Nom_Projet"));
//	  list.add(this.order);
//        }
//	  return(list);
//    // Bouml preserved body end 0003D002
//  }
    
    /**
     * This function permits to search the order in the database that have the
     * customer in parameter.
     */
    public Orders searchOrder(Customers customer) {
        // Bouml preserved body begin 00042F02
        return (this.order);
        // Bouml preserved body end 00042F02
    }

    /**
     * This function permits to search the order in the database that has this
     * id.
     */
    public Orders searchOrder(int id) {
        // Bouml preserved body begin 00042F82
        return (this.order);
        // Bouml preserved body end 00042F82
    }

    /**
     * This function permits to save in the database the order in parameter.
     */
    public void saveOrder(Orders order) {
        // Bouml preserved body begin 00043082
        this.order = order;
        // Bouml preserved body end 00043082
    }
}

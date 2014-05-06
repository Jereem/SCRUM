package beans;

 

import ManagedBeans.Database;
import java.sql.SQLException;
import junit.framework.TestCase;

public class DatabaseTest extends TestCase {
	
	//this test permits to check if the function listOrder return the orders in the database
	
	public void testListOrder_0(){
		Database b = new Database();
		assertTrue(b.getListOrder().size()==1);
	} 
        
        public void testSaveBddCustomer() throws SQLException{
		Database b = new Database();
                String expectedResult = "success";
                String result = b.saveBddCustomer();
		assertEquals(result, expectedResult);
	} 
        
}



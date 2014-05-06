package beans;

 

import ManagedBeans.Database;
import java.sql.SQLException;
import java.util.List;
import junit.framework.TestCase;

public class DatabaseTest extends TestCase {
	
	//this test permits to check if the function listOrder return the orders in the database
	
	/*public void testListOrder_0(){
		Database b = new Database();
		assertTrue(b.getListOrder().size()==1);
	} */
        
        /*public void testSaveBddCustomer() throws SQLException{
		Database b = new Database();
                String expectedResult = "success";
                String result = b.saveBddCustomer();
		assertEquals(result, expectedResult);
	}*/
        
        
        
        public void testSearchOrder(){
		Database b = new Database();
                Customers result = b.searchOrder();/*BDD pas peuplée*/
		assertNotNull(result);
	} 
        
        public void testSaveOrder(){
            	Database b = new Database();
                
        }
        
        public void testSearchSample(){
            Database b = new Database();
            
        }
        
        public void testGetListSamples(){
            Database b = new Database();
            List<Samples> result = b.searchSample("");/*BDD pas peuplée*/
            assertNotNull(result);
        }
        
        public void testSearchAnimal(){
                Database b = new Database();
                List<Animals> result = b.searchAnimal("oiseau");/*BDD pas peuplée*/
		assertNotNull(result);
        }
}



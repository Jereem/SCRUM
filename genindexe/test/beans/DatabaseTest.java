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
            List<Samples> result = b.getListSamples();/*BDD pas peuplée*/
            assertNotNull(result);
        }
        
        public void testSaveSample(){
            Database b = new Database();
            
        }
        
        public void testSearchAnimal() throws SQLException{
            Database b = new Database();
            List<Animals> result = b.searchAnimal("oiseau");/*BDD pas peuplée*/
            assertNotNull(result);
        }
        
        public void testGetUser(){
            Database b = new Database();
        }
        
        public void testGetListCustomers() throws SQLException{
            Database b = new Database();
            List<Customers> result = b.getListCustomers();/*BDD pas peuplée*/
            assertNotNull(result);
        }
        
        public void testSearchCustomerName(){
            Database b = new Database();
        }
        
        public void testSearchCustomerID(){
            Database b = new Database();
        }
        
        public void testSaveCustomer(){
            Database b = new Database();
        }
        
        public void testGetListAnalysisType(){
            Database b = new Database();
        }
        
        public void testSearchAnalysis(){
            Database b = new Database();
        }
        
        public void testSearchAnalysisID(){
            Database b = new Database();
        }
        
        public void testSaveAnalysis(){
            Database b = new Database();
        }
        
        public void testSearchTypesAnalysis(){
            Database b = new Database();
        }
        
        public void testSaveAnalysisType(){
            Database b = new Database();
        }
        
        public void testSaveBddCustomer(){
            Database b = new Database();
        }
        
        public void testSaveBddUser(){
            Database b = new Database();
        }
        
}



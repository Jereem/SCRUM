package ManagedBeans;

import beans.Analysis;
import beans.Animals;
import beans.Customers;
import beans.Orders;
import beans.Samples;
import beans.Types_analysis;
import beans.Users;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teddy
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of searchOrder method, of class Database.
     */
    @Test
    public void testSearchOrder_Customers() {
        System.out.println("searchOrder");
        Customers customer = null;
        Database instance = new Database();
        Orders expResult = null;
        Orders result = instance.searchOrder(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOrder method, of class Database.
     */
    @Test
    public void testSearchOrder_int() {
        System.out.println("searchOrder");
        int id = 0;
        Database instance = new Database();
        Orders expResult = null;
        Orders result = instance.searchOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrder method, of class Database.
     */
    @Test
    public void testSaveOrder() {
        System.out.println("saveOrder");
        Orders order = null;
        Database instance = new Database();
        instance.saveOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchSample method, of class Database.
     */
    @Test
    public void testSearchSample() throws Exception {
        System.out.println("searchSample");
        String id = "";
        Database instance = new Database();
        Samples expResult = null;
        Samples result = instance.searchSample(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListSamples method, of class Database.
     */
    @Test
    public void testGetListSamples() {
        System.out.println("getListSamples");
        Database instance = new Database();
        List<Samples> expResult = null;
        List<Samples> result = instance.getListSamples();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSample method, of class Database.
     */
    @Test
    public void testSaveSample() {
        System.out.println("saveSample");
        Samples sample = null;
        Database instance = new Database();
        instance.saveSample(sample);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAnimal method, of class Database.
     */
    @Test
    public void testSearchAnimal() throws Exception {
        System.out.println("searchAnimal");
        String specie = "";
        Database instance = new Database();
        List<Animals> expResult = null;
        List<Animals> result = instance.searchAnimal(specie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Database.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Database instance = new Database();
        Users expResult = null;
        Users result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListCustomers method, of class Database.
     */
    @Test
    public void testGetListCustomers() throws Exception {
        System.out.println("getListCustomers");
        Database instance = new Database();
        List<Customers> expResult = null;
        List<Customers> result = instance.getListCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCustomerName method, of class Database.
     */
    @Test
    public void testSearchCustomerName() throws Exception {
        System.out.println("searchCustomerName");
        String name = "";
        Database instance = new Database();
        Customers expResult = null;
        Customers result = instance.searchCustomerName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCustomerID method, of class Database.
     */
    @Test
    public void testSearchCustomerID() throws Exception {
        System.out.println("searchCustomerID");
        int ID = 0;
        Database instance = new Database();
        Customers expResult = null;
        Customers result = instance.searchCustomerID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCustomer method, of class Database.
     */
    @Test
    public void testSaveCustomer() throws Exception {
        System.out.println("saveCustomer");
        Customers cust = null;
        Database instance = new Database();
        instance.saveCustomer(cust);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListAnalysisType method, of class Database.
     */
    @Test
    public void testGetListAnalysisType() throws Exception {
        System.out.println("getListAnalysisType");
        Database instance = new Database();
        List<Types_analysis> expResult = null;
        List<Types_analysis> result = instance.getListAnalysisType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAnalysis method, of class Database.
     */
    @Test
    public void testSearchAnalysis() {
        System.out.println("searchAnalysis");
        Types_analysis type = null;
        Database instance = new Database();
        Analysis expResult = null;
        Analysis result = instance.searchAnalysis(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAnalysisID method, of class Database.
     */
    @Test
    public void testSearchAnalysisID() {
        System.out.println("searchAnalysisID");
        int ID = 0;
        Database instance = new Database();
        Analysis expResult = null;
        Analysis result = instance.searchAnalysisID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAnalysis method, of class Database.
     */
    @Test
    public void testSaveAnalysis() {
        System.out.println("saveAnalysis");
        Analysis analysis = null;
        Database instance = new Database();
        instance.saveAnalysis(analysis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTypesAnalysis method, of class Database.
     */
    @Test
    public void testSearchTypesAnalysis() throws Exception {
        System.out.println("searchTypesAnalysis");
        String name = "";
        Database instance = new Database();
        Types_analysis expResult = null;
        Types_analysis result = instance.searchTypesAnalysis(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAnalysisType method, of class Database.
     */
    @Test
    public void testSaveAnalysisType() {
        System.out.println("saveAnalysisType");
        Types_analysis typeAnalysis = null;
        Database instance = new Database();
        instance.saveAnalysisType(typeAnalysis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveBddCustomer method, of class Database.
     */
    @Test
    public void testSaveBddCustomer() throws Exception {
        System.out.println("saveBddCustomer");
        Database instance = new Database();
        String expResult = "";
        String result = instance.saveBddCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSpecie method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testSaveSpecie() throws Exception {
        System.out.println("saveSpecie");
        String specie = "tyrannosaure";
        int category = 1;
        Database instance = new Database();
        String expResult = "success";
        String result = instance.saveSpecie(specie, category);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveBddUser method, of class Database.
     */
    @Test
    public void testSaveBddUser() throws Exception {
        System.out.println("saveBddUser");
        Database instance = new Database();
        String expResult = "";
        String result = instance.saveBddUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateJavaToSQL method, of class Database.
     */
    @Test
    public void testDateJavaToSQL() {
        System.out.println("dateJavaToSQL");
        Date datejava = null;
        Database instance = new Database();
        String expResult = "";
        String result = instance.dateJavaToSQL(datejava);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateSQLToJava method, of class Database.
     */
    @Test
    public void testDateSQLToJava() {
        System.out.println("dateSQLToJava");
        java.sql.Date dateSQL = null;
        Database instance = new Database();
        beans.Date expResult = null;
        beans.Date result = instance.dateSQLToJava(dateSQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

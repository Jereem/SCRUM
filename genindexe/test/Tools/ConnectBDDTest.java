/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tools;

import java.sql.Connection;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yoyo
 */
public class ConnectBDDTest {
    
    public ConnectBDDTest() {
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
     * Test of testDriver method, of class ConnectBDD.
     */
    @Test
    public void testTestDriver() {
        System.out.println("testDriver");
        ConnectBDD instance = new ConnectBDD();
        boolean expResult = false;
        boolean result = instance.testDriver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyConnexion method, of class ConnectBDD.
     */
    @Test
    public void testGetMyConnexion() {
        System.out.println("getMyConnexion");
        ConnectBDD instance = new ConnectBDD();
        Connection expResult = null;
        Connection result = instance.getMyConnexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyStatement method, of class ConnectBDD.
     */
    @Test
    public void testGetMyStatement() {
        System.out.println("getMyStatement");
        ConnectBDD instance = new ConnectBDD();
        Statement expResult = null;
        Statement result = instance.getMyStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

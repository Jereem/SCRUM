/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import Tools.ConnectBDD;
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
 * @author teddy
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
        boolean expResult = true;
        boolean result = instance.testDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMyConnexion method, of class ConnectBDD.
     */
    @Test
    public void testGetMyConnexion() {
        System.out.println("getMyConnexion");
        ConnectBDD instance = new ConnectBDD();
        Connection result = instance.getMyConnexion();
        assertNotNull(result);
    }

    /**
     * Test of getMyStatement method, of class ConnectBDD.
     */
    @Test
    public void testGetMyStatement() {
        System.out.println("getMyStatement");
        ConnectBDD instance = new ConnectBDD();
        Statement result = instance.getMyStatement();
        assertNotNull(result);
    }
    
}

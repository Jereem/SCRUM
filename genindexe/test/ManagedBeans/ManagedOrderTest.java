/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Customers;
import beans.Orders;
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
public class ManagedOrderTest {
    
    public ManagedOrderTest() {
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
     * Test of getSelectedOrder method, of class ManagedOrder.
     */
    @Test
    public void testGetSelectedOrder() {
        System.out.println("getSelectedOrder");
        ManagedOrder instance = new ManagedOrder();
        Orders expResult = null;
        Orders result = instance.getSelectedOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedOrder method, of class ManagedOrder.
     */
    @Test
    public void testSetSelectedOrder() {
        System.out.println("setSelectedOrder");
        Orders selectedOrder = null;
        ManagedOrder instance = new ManagedOrder();
        instance.setSelectedOrder(selectedOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOrder method, of class ManagedOrder.
     */
    @Test
    public void testGetListOrder() {
        System.out.println("getListOrder");
        ManagedOrder instance = new ManagedOrder();
        List<Orders> expResult = null;
        List<Orders> result = instance.getListOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOrder method, of class ManagedOrder.
     */
    @Test
    public void testSearchOrder_Customers() {
        System.out.println("searchOrder");
        Customers customer = null;
        ManagedOrder instance = new ManagedOrder();
        Orders expResult = null;
        Orders result = instance.searchOrder(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOrder method, of class ManagedOrder.
     */
    @Test
    public void testSearchOrder_int() {
        System.out.println("searchOrder");
        int id = 0;
        ManagedOrder instance = new ManagedOrder();
        Orders expResult = null;
        Orders result = instance.searchOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrder method, of class ManagedOrder.
     */
    @Test
    public void testSaveOrder() {
        System.out.println("saveOrder");
        Orders order = null;
        ManagedOrder instance = new ManagedOrder();
        String expResult = "";
        String result = instance.saveOrder(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchLastId method, of class ManagedOrder.
     */
    @Test
    public void testSearchLastId() {
        System.out.println("searchLastId");
        ManagedOrder instance = new ManagedOrder();
        int expResult = 0;
        int result = instance.searchLastId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchIdTypeAnalyse method, of class ManagedOrder.
     */
    @Test
    public void testSearchIdTypeAnalyse() {
        System.out.println("searchIdTypeAnalyse");
        Orders order = null;
        ManagedOrder instance = new ManagedOrder();
        int expResult = 0;
        int result = instance.searchIdTypeAnalyse(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

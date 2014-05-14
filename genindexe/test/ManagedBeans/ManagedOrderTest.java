/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Analysis;
import beans.Animals;
import beans.Customers;
import beans.Orders;
import beans.Samples;
import beans.Types_analysis;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        java.util.Date D_sampling = new Date();
        java.util.Date D_storage = new Date();
        Date birthday = new Date();
        Animals anim = new Animals("Vache", birthday, "titi");
        anim.setID(1);
        ArrayList<Samples> samples = new ArrayList<>();
        Types_analysis typeAna = new Types_analysis("Bird sexing", 150);
        Analysis ana = new Analysis(22, typeAna);
        Samples sample1 = new Samples("plume", D_sampling, D_storage, anim);
        sample1.addAnalysis(ana);
        samples.add(sample1);
        Samples sample2 = new Samples("sang", D_sampling, D_storage, anim);
        sample2.addAnalysis(ana);
        samples.add(sample2);
        Date dReception = new Date();
        Orders order = new Orders(samples, dReception, 1);
        ManagedOrder instance = new ManagedOrder();
        String expResult = "success";
        String result = instance.saveOrder(order);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchLastId method, of class ManagedOrder.
     */
    @Test
    public void testSearchLastId() {
        System.out.println("searchLastId");
        ManagedOrder instance = new ManagedOrder();
        int result = instance.searchLastId();
        assertThat(result, is(not(0)));
    }

    /**
     * Test of searchIdTypeAnalyse method, of class ManagedOrder.
     */
    @Test
    public void testSearchIdTypeAnalyse() {
        System.out.println("searchIdTypeAnalyse");
        java.util.Date D_sampling = new Date();
        java.util.Date D_storage = new Date();
        Date birthday = new Date();
        Animals anim = new Animals("Vache", birthday, "titi");
        anim.setID(1);
        ArrayList<Samples> samples = new ArrayList<>();
        Types_analysis typeAna = new Types_analysis("Bird sexing", 150);
        Analysis ana = new Analysis(22, typeAna);
        Samples sample1 = new Samples("plume", D_sampling, D_storage, anim);
        sample1.addAnalysis(ana);
        samples.add(sample1);
        Samples sample2 = new Samples("sang", D_sampling, D_storage, anim);
        sample2.addAnalysis(ana);
        samples.add(sample2);
        Date dReception = new Date();
        Orders order = new Orders(samples, dReception, 5);
        ManagedOrder instance = new ManagedOrder();
        int expResult = 1;
        int result = instance.searchIdTypeAnalyse(order);
        assertEquals(expResult, result);
    }
    
}

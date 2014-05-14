/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Animals;
import beans.Samples;
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
public class ManagedSampleTest {
    
    public ManagedSampleTest() {
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
     * Test of getSelectedSample method, of class ManagedSample.
     */
    @Test
    public void testGetSelectedSample() {
        System.out.println("getSelectedSample");
        ManagedSample instance = new ManagedSample();
        Samples expResult = null;
        Samples result = instance.getSelectedSample();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedSample method, of class ManagedSample.
     */
    @Test
    public void testSetSelectedSample() {
        System.out.println("setSelectedSample");
        Samples selectedSample = null;
        ManagedSample instance = new ManagedSample();
        instance.setSelectedSample(selectedSample);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of searchSample method, of class ManagedSample.
//     */
//    @Test
//    public void testSearchSample() throws Exception {
//        System.out.println("searchSample");
//        String id = "";
//        ManagedSample instance = new ManagedSample();
//        Samples expResult = null;
//        Samples result = instance.searchSample(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getListSamples method, of class ManagedSample.
     */
    @Test
    public void testGetListSamples() {
        System.out.println("getListSamples");
        ManagedSample instance = new ManagedSample();
        List<Samples> expResult = null;
        List<Samples> result = instance.getListSamples();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetListTypeSamples method, of class ManagedSample.
     */
    @Test
    public void testGetListTypeSamples() throws Exception {
        System.out.println("GetListTypeSamples");
        ManagedSample instance = new ManagedSample();
        List<String> expResult = null;
        List<String> result = instance.GetListTypeSamples();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSample method, of class ManagedSample.
     */
    @Test
    public void testSaveSample() {
        System.out.println("saveSample");
        java.util.Date D_sampling = new Date();
        java.util.Date D_storage = new Date();
        Date birthday = new Date();
        Animals anim = new Animals("Vache", birthday, "titi");
        anim.setID(1);
        Samples sample = new Samples("plume", D_sampling, D_storage, anim);
        Date dReception = new Date();
        int idCommande = 1;
        ManagedSample instance = new ManagedSample(sample);
        String expResult = "success";
        String result = instance.saveSample(sample, dReception, idCommande);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchIdTypeSample method, of class ManagedSample.
     */
    @Test
    public void testSearchIdTypeSample() {
        System.out.println("searchIdTypeSample");
        java.util.Date D_sampling = new Date();
        java.util.Date D_storage = new Date();
        Date birthday = new Date();
        Animals anim = new Animals("Vache", birthday, "titi");
        Samples sample = new Samples("plume", D_sampling, D_storage, anim);
        ManagedSample instance = new ManagedSample(sample);
        int expResult = 1;
        int result = instance.searchIdTypeSample(sample);
        assertEquals(expResult, result);
    }
    
}

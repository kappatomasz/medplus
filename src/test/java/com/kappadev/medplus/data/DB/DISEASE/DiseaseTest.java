/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tburzynski
 */
public class DiseaseTest {
    
    public DiseaseTest() {
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
     * Test of getId method, of class Disease.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Disease instance = new Disease();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Disease.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Disease instance = new Disease();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Disease.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Disease instance = new Disease();
        byte[] expResult = null;
        byte[] result = instance.getDescription();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Disease.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        byte[] description = null;
        Disease instance = new Disease();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Disease.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Disease instance = new Disease();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Disease.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Disease instance = new Disease();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Disease.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Disease instance = new Disease();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

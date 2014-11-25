/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.attachment;

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
public class AttachmentTest {
    
    public AttachmentTest() {
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
     * Test of getId method, of class Attachment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Attachment instance = new Attachment();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Attachment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Attachment instance = new Attachment();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient_id method, of class Attachment.
     */
    @Test
    public void testGetPatient_id() {
        System.out.println("getPatient_id");
        Attachment instance = new Attachment();
        long expResult = 0L;
        long result = instance.getPatient_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient_id method, of class Attachment.
     */
    @Test
    public void testSetPatient_id() {
        System.out.println("setPatient_id");
        long patient_id = 0L;
        Attachment instance = new Attachment();
        instance.setPatient_id(patient_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiseaseId method, of class Attachment.
     */
    @Test
    public void testSetDiseaseId() {
        System.out.println("setDiseaseId");
        long diseaseId = 0L;
        Attachment instance = new Attachment();
        instance.setDiseaseId(diseaseId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiseaseId method, of class Attachment.
     */
    @Test
    public void testGetDiseaseId() {
        System.out.println("getDiseaseId");
        Attachment instance = new Attachment();
        long expResult = 0L;
        long result = instance.getDiseaseId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentType method, of class Attachment.
     */
    @Test
    public void testGetContentType() {
        System.out.println("getContentType");
        Attachment instance = new Attachment();
        String expResult = "";
        String result = instance.getContentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContentType method, of class Attachment.
     */
    @Test
    public void testSetContentType() {
        System.out.println("setContentType");
        String contentType = "";
        Attachment instance = new Attachment();
        instance.setContentType(contentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBlob method, of class Attachment.
     */
    @Test
    public void testGetBlob() {
        System.out.println("getBlob");
        Attachment instance = new Attachment();
        byte[] expResult = null;
        byte[] result = instance.getBlob();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlob method, of class Attachment.
     */
    @Test
    public void testSetBlob() {
        System.out.println("setBlob");
        byte[] blob = null;
        Attachment instance = new Attachment();
        instance.setBlob(blob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class Attachment.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Attachment instance = new Attachment();
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class Attachment.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "";
        Attachment instance = new Attachment();
        instance.setFileName(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Attachment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Attachment instance = new Attachment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSelected method, of class Attachment.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        Attachment instance = new Attachment();
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class Attachment.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = false;
        Attachment instance = new Attachment();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

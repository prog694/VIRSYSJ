/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj;

import crio.hardware.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blake
 */
public class DigitalInputTest {

    public DigitalInputTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        DigitalSidecar.inputBits[1] = true;
    }

    @After
    public void tearDown() {
        DigitalSidecar.inputBits[1] = false;
    }

    /**
     * Test of get method, of class DigitalInput.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        DigitalInput instance = new DigitalInput(1);
        boolean expResult = true;
        boolean result = instance.get();
        assertEquals(expResult, result);
    }

}
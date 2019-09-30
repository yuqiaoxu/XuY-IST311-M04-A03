/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xyq
 */
public class HelpfulInfoTest {
    
    public HelpfulInfoTest() {
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
     * Test of getUser method, of class HelpfulInfo.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        HelpfulInfo instance = new HelpfulInfo ("Ethan", "There is a 80% chance of getting a fire in thea area");
        String expResult = "Ethan";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class HelpfulInfo.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String User = "Ethan";
        HelpfulInfo instance = new HelpfulInfo ("Ethan", "There is a 80% chance of getting a fire in thea area");
        instance.setUser(User);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class HelpfulInfo.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        HelpfulInfo instance = new HelpfulInfo ("Ethan", "There is a 80% chance of getting a fire in thea area");
        String expResult = "There is a 80% chance of getting a fire in thea area";
        String result = instance.getMessage();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class HelpfulInfo.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String Message = "There is a 80% chance of getting a fire in thea area";
        HelpfulInfo instance = new HelpfulInfo ("Ethan", "There is a 80% chance of getting a fire in thea area");
        instance.setMessage(Message);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sendHelpfulInfo method, of class HelpfulInfo.
     */
    @Test
    public void testSendHelpfulInfo() {
        System.out.println("sendHelpfulInfo");
        String probability = "";
        HelpfulInfo instance = new HelpfulInfo ("Ethan", "There is a 80% chance of getting a fire in thea area");
        String expResult = "There is a 80% chance of getting a fire in thea area";
        String result = instance.sendHelpfulInfo(probability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

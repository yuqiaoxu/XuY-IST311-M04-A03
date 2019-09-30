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
public class CommunityBoardTest {
    
    public CommunityBoardTest() {
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
     * Test of getAuthor method, of class CommunityBoard.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        String expResult = "Ethan";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class CommunityBoard.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Ethan";
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");;
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class CommunityBoard.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        String expResult = "I need help in The Park area";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class CommunityBoard.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "I need help in The Park area";
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamps method, of class CommunityBoard.
     */
    @Test
    public void testGetTimestamps() {
        System.out.println("getTimestamps");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        double expResult = 10.25;
        double result = instance.getTimestamps();
        assertEquals(expResult, result,10.25);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamps method, of class CommunityBoard.
     */
    @Test
    public void testSetTimestamps() {
        System.out.println("setTimestamps");
        double timestamps = 10.25;
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        instance.setTimestamps(timestamps);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class CommunityBoard.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");;
        String expResult = "In Progress";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class CommunityBoard.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "In Progress";
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of totalposts method, of class CommunityBoard.
     */
    @Test
    public void testTotalposts() {
        System.out.println("totalposts");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        instance.totalposts();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Comments method, of class CommunityBoard.
     */
    @Test
    public void testComments() {
        System.out.println("Comments");
        CommunityBoard instance = new CommunityBoard ("Ethan", "I need help in The Park area", 10.25, "In Progress");
        instance.Comments();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

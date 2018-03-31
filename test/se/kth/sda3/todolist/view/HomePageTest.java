/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda3.todolist.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pradeep
 */
public class HomePageTest {
    
    public HomePageTest() {
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
     * Test of homePage method, of class HomePage.
     */
    @Test
    public void testHomePage() {
        System.out.println("homePage");
        HomePage instance = new HomePage();
        int expResult = 0;
        int result = instance.homePage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of homeMenu method, of class HomePage.
     */
    @Test
    public void testHomeMenu() {
        System.out.println("homeMenu");
        HomePage instance = new HomePage();
        int expResult = 0;
        int result = instance.homeMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

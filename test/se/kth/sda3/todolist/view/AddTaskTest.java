/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda3.todolist.view;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.sda3.todolist.model.Task;

/**
 * @author Pradeep
 */
public class AddTaskTest {
    
    public AddTaskTest() {
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
     * Test of showDisplay method, of class AddTask.
     */
    @Test
    public void testShowDisplay() {
        System.out.println("showDisplay");
        ArrayList<Task> tasks = null;
        AddTask instance = new AddTask();
        instance.showDisplay(tasks);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

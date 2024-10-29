/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.part_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
      
    public TaskTest() {
    }
   

    /**
     * Test of checkDescription method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testCheckDescription() {
        System.out.println("checkDescription");
        String taskD = "Create Login to authenticate user";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkDescription(taskD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskNam = "LoginFeature";
        int t = 0;
        String developer = "Robyn Harrison";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(taskNam, t, developer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskNam = "LoginFeature";
        String taskId = "";
        String taskD = "Create Login to authenticate user";
        String developer = "Robyn Harrison";
        int t = 0;
        String status = "To Do";
        String durationInput = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskNam, taskId, taskD, developer, t, status, durationInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of time method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testTime() {
        System.out.println("time");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Task method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testTask() {
        System.out.println("Task");
        String taskNam = "LoginFeature";
        String taskId = "";
        String taskD = "Create Login to authenticate user";
        String developer = "Robyn Harrison";
        int taskNum = 2;
        String status = "To Do";
        Task instance = new Task();
        instance.Task(taskNam, taskId, taskD, developer, taskNum, status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testDisplay() {
        System.out.println("display");
        Task instance = new Task();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Task.
     */
    @org.junit.jupiter.api.Test
    public void testAddTask() {
        System.out.println("addTask");
        Task instance = new Task();
        instance.addTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }
    
}

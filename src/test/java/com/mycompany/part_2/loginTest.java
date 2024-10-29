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
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String name = "";
        String lastname = "";
        String username = "";
        String password = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerUser(name, lastname, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginUser = false;
        login instance = new login();
        String expResult = "";
        String result = instance.returnLoginStatus(loginUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

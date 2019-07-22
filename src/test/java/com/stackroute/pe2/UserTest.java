package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @After
    public void tearDown() throws Exception {
        user = null;
    }

    @Test
    public void inputDataShouldGiveAValidOutput(){
        assertEquals("within range",user.isValidAge(22));
        assertEquals("Adithya Gowda",user.getFulName("Adithya","Gowda"));
    }

    @Test
    public void inputDataValidatesForInequality(){
        assertNotEquals("within",user.isValidAge(22));
        assertNotEquals(" Gowda",user.getFulName("Adithya","Gowda"));
    }
}
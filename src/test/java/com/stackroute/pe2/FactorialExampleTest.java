package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialExampleTest {
    FactorialExample factorialExample;

    @Before
    public void setUp() throws Exception {
        factorialExample = new FactorialExample();
    }

    @After
    public void tearDown() throws Exception {
        factorialExample = null;
    }

    @Test
    public void callingBothMetodsWillPrintTheFactorials(){
        assertEquals("Int factorials",factorialExample.printIntFactorials());
        assertEquals("Long factorials",factorialExample.printLongFactorials());
    }

    @Test
    public void callingBothMethodsWillCheckForInequality(){
        assertNotEquals("Int",factorialExample.printIntFactorials());
        assertNotEquals("factorials",factorialExample.printLongFactorials());
    }

    @Test
    public void callingBothMetodsWillReturnNotNullValues(){
        assertNotNull(factorialExample.printIntFactorials());
        assertNotNull(factorialExample.printLongFactorials());
    }

}
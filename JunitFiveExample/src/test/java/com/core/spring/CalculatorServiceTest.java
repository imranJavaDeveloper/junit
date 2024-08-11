package com.core.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
/*  Test the praticular bloack of the code indepedet*/
    @Test
    public void add(){
        int result=CalculatorService.add(25,32);
        int expected=57;
        Assertions.assertEquals(expected,result);
        System.out.println("add method called");

    }

    @Test
    public void divide(){
        int result=CalculatorService.divide(45,9);
        int expected=5;
        Assertions.assertEquals(result,expected);
        System.out.println("divide method called");
    }
    @Test
    public void addTwoString(){
        String result=CalculatorService.addTwoString("md ","imran alam");

        String expected="md imran alam";
        Assertions.assertEquals(result,expected);
        System.out.println("addTwoString method called");
    }
  /* this test case run before all the test */
    @BeforeAll
    public void cleanUp(){
        System.out.println(" preform for clean up Activity");
    }
}

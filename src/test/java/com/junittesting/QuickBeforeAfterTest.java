package com.junittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }
    @Before
    public void setUp(){
        System.out.println("before test");
    }
    @Test
    public void test1(){
        System.out.println("test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test2 executed");
    }

    @After
    public void tearDown(){
        System.out.println("After test");
    }
}

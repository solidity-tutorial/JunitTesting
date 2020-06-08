package com.junittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FirstAndLastStringSameParameterizedTest {
    StringHelper stringHelper ;
    private String input ;
    private boolean output;

    public FirstAndLastStringSameParameterizedTest(String input,boolean output){
        this.input = input;
        this.output = output;
    }
    @Parameterized.Parameters
    public static Collection setParameter(){

        return Arrays.asList(new Object[][]{{"ABAB",true},{"AVC",false}});
    }
    @Before
    public void setUp(){
        stringHelper = new StringHelper();
    }
    @Test
    public void test(){
        assertEquals(output,stringHelper.areFirstAndLastTwoCharactersTheSame(input));
    }
}

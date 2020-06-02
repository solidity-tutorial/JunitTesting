package com.junittesting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {

    @Test
    public void testArray(){
        int[] numbers = {12,2,1,4};
        int[] expected = {1,2,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayNull(){
        int[] numbers = null;

        int[] expected = {1,2,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    @Test(timeout = 1000)
    public void testSort_Performance(){
        int arr[] = {12,12,111};
        for(int i=1;i<=1000000;i++){
            arr[0]=i;
            Arrays.sort(arr);
        }

    }
}

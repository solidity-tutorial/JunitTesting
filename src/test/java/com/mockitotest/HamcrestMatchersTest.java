package com.mockitotest;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class HamcrestMatchersTest {
    @Test
    public void test(){
        List<Integer> scores = Arrays.asList(99,100,11,12,14);

       // assertThat(scores,hasSize(4));
       // assertThat(scores,hasItems(99,100));
       // assertThat(scores,everyItem(lessThan(100)));


        //string
        // assertThat(null,isEmptyOrNullString());
        // assertThat("",isEmptyString());

        //Arrays
        Integer marks[]={1,2,3};
        //assertThat(marks,arrayWithSize(3));
        //assertThat(marks,arrayContaining(1,2,3));
        //assertThat(marks,arrayContainingInAnyOrder(1,2,3));



    }

}

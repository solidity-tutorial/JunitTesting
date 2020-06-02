package com.junittesting;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperTestParameterizedTest {
    StringHelper stringHelper ;

    private String input;
    private String expectedOutput;

    public StringHelperTestParameterizedTest(String input,String expectedOutput){
        this.input=input;
        this.expectedOutput=expectedOutput;
    }
    @Parameterized.Parameters
    public static Collection<String[]> testCondition(){
        String[][] expectedOutputs = { {"AACD","CD"},
        {"ACD","CD"} };

        return Arrays.asList(expectedOutputs);
    }
    @Before
    public void before(){
        stringHelper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position(){
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }

}

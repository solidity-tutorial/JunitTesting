package com.junittesting;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringHelperTest {
    StringHelper stringHelper ;

    @Before
    public void before(){
        stringHelper = new StringHelper();
    }
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position(){
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AisNot(){
        assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABB"));
    }

}

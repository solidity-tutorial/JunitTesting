package com.mockitotest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {
    @Test
    public void test(){
        List arrayListMock = spy(ArrayList.class);
        //mock return default values
        assertEquals(0,arrayListMock.size());
        stub(arrayListMock.size()).toReturn(5);
        assertEquals(5,arrayListMock.size());
    }
}
//Mock are the objects that store methods calls                         ---fake objects
//Stubs are hold predefined data and uses it to give responses during tests.        --half real objects
//parially mock objects real objects

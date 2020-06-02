package com.mockitotest;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void letsMockListSizeMethod(){
        List listMock = mock(List.class);
        //single return values
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());
    }
    @Test
    public void letsMockListSize_ReturnMultipleValues(){
        List listMock = mock(List.class);
        //return multiple values
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }
    @Test
    public void letsMockListGetMethod(){
        List listMock = mock(List.class);
        //argument matcher
        when(listMock.get(anyInt())).thenReturn("name");
        assertEquals("name",listMock.get(0));
        assertEquals("name",listMock.get(1));
    }
    @Test(expected = RuntimeException.class)
    public void letsMockListGetMethodException(){
        List listMock = mock(List.class);
        //throw exception
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("something"));
        assertEquals("name",listMock.get(0));
        assertEquals("name",listMock.get(1));
    }
}

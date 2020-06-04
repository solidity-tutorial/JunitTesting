package com.mockitotest;

import com.mockito.api.ITodoService;
import com.mockito.api.TodoBusinessImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {
    @Test
    public void testMock(){
        //data
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");

        ITodoService mockTodoService = mock(ITodoService.class);
        when( mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);
        verify(mockTodoService,atLeast(2)).create();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filterTodoList.size());
    }
    @Test
    public void mockBDDMethod(){
        //given
        List<String> data = Arrays.asList("vikas Spring");
        ITodoService iTodoService = mock(ITodoService.class);
        given(iTodoService.retrieveTodos("user1")).willReturn(data);
        //when action
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(iTodoService);
        List<String> list = todoBusiness.retrieveTodosRelatedToSpring("user1");
        //then assersts
        assertThat(list.size(),is(1));
    }
    @Test
    public void mockMethod(){
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");
        ITodoService todoService = mock(ITodoService.class);
        when(todoService.retrieveTodos("user1")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
    }

    @Test
    public void testMockBDD(){

        //given
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");
        ITodoService mockTodoService = mock(ITodoService.class);
        given( mockTodoService.retrieveTodos("Dummy")).willReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

        //when
        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        //then
        assertThat(filterTodoList.size(),is(2));
    }



}

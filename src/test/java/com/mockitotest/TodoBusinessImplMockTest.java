package com.mockitotest;

import com.mockito.api.ITodoService;
import com.mockito.api.TodoBusinessImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {
    @Test
    public void testMock(){
        //data
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");

        ITodoService mockTodoService = mock(ITodoService.class);
        when( mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filterTodoList.size());
    }

    @Test
    public void mockMethod(){
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");
        ITodoService todoService = mock(ITodoService.class);
        when(todoService.retrieveTodos("user1")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);


    }
}

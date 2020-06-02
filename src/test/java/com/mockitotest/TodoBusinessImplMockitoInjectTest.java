package com.mockitotest;

import com.mockito.api.ITodoService;
import com.mockito.api.TodoBusinessImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockitoInjectTest {

    @Mock
    ITodoService mockTodoService;
    // ITodoService mockTodoService = mock(ITodoService.class);

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;
   // TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
    //automatically inject
    // check ITodoService this type of property in TodoBusinessImpl /.../matching....

    @Test
    public void test(){
        //data
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");

        when( mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);

        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,filterTodoList.size());
    }
}

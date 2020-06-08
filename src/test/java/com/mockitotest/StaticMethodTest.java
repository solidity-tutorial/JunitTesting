package com.mockitotest;

import com.junittesting.StringHelper;
import com.mockito.api.ITodoService;
import com.mockito.api.TodoBusinessImpl;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.when;

public class StaticMethodTest {

    @Mock
    ITodoService mockTodoService;
    // ITodoService mockTodoService = mock(ITodoService.class);

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;
    // TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
    //automatically inject
    // check ITodoService this type of property in TodoBusinessImpl /.../matching....

    @Test
    public void testM(){
        //data
        List<String > todos = Arrays.asList("Learn Spring MVC","Learn Spring");

        when(mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);

        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        Mockito.verify(mockTodoService,atLeast(0)).create();
        assertEquals(2,filterTodoList.size());
    }

    @Test
    public void test(){
        assertEquals(1, ITodoService.profile());
    }
}

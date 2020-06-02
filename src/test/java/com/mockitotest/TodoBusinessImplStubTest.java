package com.mockitotest;

import com.mockito.api.ITodoService;
import com.mockito.api.TodoBusinessImpl;
import com.mockito.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {
    @Test
    public void test(){
        ITodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy_user");
        assertEquals(2,filterTodoList.size());
    }

    @Test
    public void testStub(){
        ITodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filterTodoList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy2");
        assertEquals(0,filterTodoList.size());
    }
}
//dummy implementation of interface
// it is used for simple problems...
//disadvantages :   maintaining problem
                    //dynamic condition

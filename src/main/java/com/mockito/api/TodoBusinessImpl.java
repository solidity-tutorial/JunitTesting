package com.mockito.api;

import com.mockito.api.ITodoService;

import java.util.ArrayList;
import java.util.List;

//ToBusinessImpl SUT(System under test)
//TodoService Dependency
public class TodoBusinessImpl {
    private ITodoService todoService;

    public TodoBusinessImpl(ITodoService todoService){
        this.todoService=todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        todoService.create();
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for(String todo:todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }


}

package com.mockito.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ITodoService {
    @Override
    public void create() {

    }

    @Override
    public List<String> retrieveTodos(String user) {
        if(user.equals("Dummy2")){
            return Arrays.asList("");
        }
        else{
            return Arrays.asList("Learn Spring MC","Learn Spring");
        }
    }
}

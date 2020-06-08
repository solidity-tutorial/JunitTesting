package com.mockito.api;

import java.util.List;

public interface ITodoService {
    public void create();
    public List<String> retrieveTodos(String user);
    static int profile(){
        return 1;
    }
}

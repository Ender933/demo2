package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.TodoRepository;
import com.example.demo.model.TaskDTO;

@Service
public class TodoService {
    private final TodoRepository repository;

    @Autowired
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public String test() {
        TaskDTO task = new TaskDTO("1", "asdf");
        String name = "Test";
        repository.save(task);
        return "Hello World!2";
    }
}

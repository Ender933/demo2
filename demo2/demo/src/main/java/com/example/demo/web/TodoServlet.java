package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/api")
public class TodoServlet {
    private final TodoService todoService;

    @Autowired
    public TodoServlet(TodoService service){
        todoService = service;
    }

    @GetMapping("/test")
    public String test(){
        return todoService.test();
    }
}

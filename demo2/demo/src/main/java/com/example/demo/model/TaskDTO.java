package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tasks")
public class TaskDTO {
    @Id
    private String id;
    private String name;

    public TaskDTO(String id, String name){
        this.id = id;
        this.name = name;
    }

    public TaskDTO(String id){
        this.id = id;
        this.name = "Peter";
    }

}

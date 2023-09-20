package com.example.demo.data;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.TaskDTO;
    

public interface TodoRepository extends MongoRepository<TaskDTO, String> {
    
}


package com.example.todo.service;

import com.example.todo.dto.requests.CreateTodoRequest;
import com.example.todo.dto.response.NewTodoResponse;
import com.example.todo.model.SampleTask;

import java.util.Date;
import java.util.List;


public interface SampleTaskService {
    NewTodoResponse createTask(CreateTodoRequest createTodoRequest);

    List<SampleTask> viewAllTask(Date taskDate);
}

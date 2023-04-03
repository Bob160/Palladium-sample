package com.example.todo.controller;

import com.example.todo.dto.requests.CreateTodoRequest;
import com.example.todo.dto.response.NewTodoResponse;
import com.example.todo.model.SampleTask;
import com.example.todo.service.SampleTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class TodoController {

    private final SampleTaskService sampleTaskService;
    private final NewTodoResponse newTodoResponse;
    //private final CreateTodoRequest createTodoRequest;

//    public TodoController(SampleTaskService sampleTaskService) {
//        this.sampleTaskService = sampleTaskService;
//    }
    private final CreateTodoRequest createTodoRequest;
    @PostMapping("/create")
    public ResponseEntity<NewTodoResponse> createTodo (CreateTodoRequest createTodoRequest) {
        NewTodoResponse newTodoResponse1 = sampleTaskService.createTask(createTodoRequest);
        return new ResponseEntity<>(newTodoResponse1, HttpStatus.CREATED);
    }

    @GetMapping("/view-all")
    public ResponseEntity<List<SampleTask>> viewAll (Date taskDate) {
        List <SampleTask> allList = sampleTaskService.viewAllTask(taskDate);
        return new ResponseEntity<>(allList, HttpStatus.OK);
    }
}

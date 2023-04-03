package com.example.todo.serviceImpl;

import com.example.todo.dto.requests.CreateTodoRequest;
import com.example.todo.dto.response.NewTodoResponse;
import com.example.todo.model.SampleTask;
import com.example.todo.repository.TaskRepository;
import com.example.todo.service.SampleTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleTaskServiceImpl implements SampleTaskService {
    private final TaskRepository taskRepository;
    private final CreateTodoRequest createTodoRequest;
    private final NewTodoResponse newTodoResponse;

//    public SampleTaskServiceImpl(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    @Override
    public NewTodoResponse createTask(CreateTodoRequest createTodoRequest) {
        SampleTask newTask = taskRepository.findByTaskname(createTodoRequest.getTaskName());

            if (newTask == null) {
                newTodoResponse.setTaskName(createTodoRequest.getTaskName());
                newTodoResponse.setTaskDate(createTodoRequest.getTaskDate());
                newTodoResponse.setStatus(createTodoRequest.getStatus());
                return newTodoResponse;
            }
            newTodoResponse.setTaskName(createTodoRequest.getTaskName());
            return new NewTodoResponse();

    }

    @Override
    public List<SampleTask> viewAllTask(Date taskDate) {

        List<SampleTask> allTask = new ArrayList<>();
        SampleTask myTasks = (SampleTask) taskRepository.findAllByTaskDate(createTodoRequest.getTaskDate());
        allTask.add(myTasks);
        //newTodoResponse.setTaskDate(createTodoRequest.getTaskDate());

        return allTask;
    }
}

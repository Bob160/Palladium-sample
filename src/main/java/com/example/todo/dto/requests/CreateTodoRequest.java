package com.example.todo.dto.requests;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateTodoRequest {
    @Id
    private Long id;
    private String taskName;
    private Date taskDate;
    private String status;
}

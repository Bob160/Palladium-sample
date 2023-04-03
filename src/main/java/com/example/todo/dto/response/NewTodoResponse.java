package com.example.todo.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class NewTodoResponse {
    private Long id;
    private String taskName;
    private Date taskDate;
    private String status;
}

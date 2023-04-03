package com.example.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class SampleTask {

    @Id
    private Long id;
    private String taskName;
    private Date taskDate;
    private String status;

}

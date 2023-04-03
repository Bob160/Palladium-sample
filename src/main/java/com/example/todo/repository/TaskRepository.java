package com.example.todo.repository;

import com.example.todo.model.SampleTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
 public interface TaskRepository extends JpaRepository<Long, SampleTask> {

    SampleTask findById (Long id);

    SampleTask findByTaskname (String taskname);

    List<SampleTask> findAllByTaskDate (Date taskDate);

}

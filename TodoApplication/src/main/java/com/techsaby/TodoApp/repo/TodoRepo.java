package com.techsaby.TodoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techsaby.TodoApp.model.TodoModel;

public interface TodoRepo extends JpaRepository<TodoModel, Long>{

}

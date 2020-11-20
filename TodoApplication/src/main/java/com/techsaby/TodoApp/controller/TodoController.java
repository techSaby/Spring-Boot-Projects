package com.techsaby.TodoApp.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsaby.TodoApp.repo.TodoRepo;
import com.techsaby.TodoApp.model.TodoModel;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
	
	@Autowired
	private TodoRepo todorepo;
	
	@GetMapping
	public List<TodoModel> findAll(){
		return todorepo.findAll();   //extends the methods of JPA Repository
	}
	
	
	@PostMapping
	public TodoModel save(@Valid @NotNull @RequestBody TodoModel todomodel) {
		return todorepo.save(todomodel);
	}
	
	@PutMapping
	public TodoModel update(@Valid @NotNull @RequestBody TodoModel todomodel) {
		return todorepo.save(todomodel);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		todorepo.deleteById(id);
	}

}

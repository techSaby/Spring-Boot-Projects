package com.techsaby.TodoApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class TodoModel {
	
	private long id;
	@NotBlank
	private String title;
	private boolean status;
	
	public TodoModel() {
		
	}
	
	public TodoModel(long id, String title, boolean status) {
		
		this.id = id;
		this.title = title;
		this.status = status;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	

}

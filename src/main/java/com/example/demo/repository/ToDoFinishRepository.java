package com.example.demo.repository;

import com.example.demo.entity.ToDoStatus;

public interface ToDoFinishRepository {

	void finish(ToDoStatus todostatus);
	
}

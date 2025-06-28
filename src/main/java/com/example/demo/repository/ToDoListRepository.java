package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.ToDoList;

public interface ToDoListRepository {

	void add(ToDoList todolist);
	
	List<ToDoList> selectByUserId(String userId);
}

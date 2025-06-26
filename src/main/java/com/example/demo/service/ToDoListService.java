package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ToDoList;

public interface ToDoListService {

	List<ToDoList> findByUserId(String userId);
	
}

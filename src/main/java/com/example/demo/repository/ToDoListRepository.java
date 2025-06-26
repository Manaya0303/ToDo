package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.ToDoList;

public interface ToDoListRepository {

	List<ToDoList> selectByUserId(String userId);
}

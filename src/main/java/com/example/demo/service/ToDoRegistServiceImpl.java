package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDoList;
import com.example.demo.repository.ToDoListRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoRegistServiceImpl implements ToDoRegistService {
	
	private final ToDoListRepository repository;

	@Override
	public void regist(ToDoList todolist) {
		
		repository.add(todolist);

	}

}

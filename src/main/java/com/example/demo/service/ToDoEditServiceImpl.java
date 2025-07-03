package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDoList;
import com.example.demo.repository.ToDoEditRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoEditServiceImpl implements ToDoEditService {

	private final ToDoEditRepository repository;
	
	@Override
	public void edit(ToDoList todolist) {
		
		repository.update(todolist);

	}

}

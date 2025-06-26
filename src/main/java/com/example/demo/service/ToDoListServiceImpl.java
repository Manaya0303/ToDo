package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDoList;
import com.example.demo.repository.ToDoListRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoListServiceImpl implements ToDoListService {
	
	private final ToDoListRepository repository;

	@Override
	public List<ToDoList> findByUserId(String userId) {
		
		List<ToDoList> list = repository.selectByUserId(userId);
		
		return list;
	}

}

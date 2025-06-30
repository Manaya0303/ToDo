package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.ToDoFinishRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoFinishServiceImpl implements ToDoFinishService {
	
	private final ToDoFinishRepository repository;

	@Override
	public void findByContentId(int contentId) {
		
		repository.finish(contentId);
		
	}

}

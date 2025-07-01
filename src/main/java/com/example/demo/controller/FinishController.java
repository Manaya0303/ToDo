package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ToDoFinishForm;
import com.example.demo.service.ToDoFinishService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FinishController {
	
	private final ToDoFinishService service;

	@PostMapping("/finish-todo")
	public String finishToDo(@ModelAttribute ToDoFinishForm form) {
		
		service.findByContentId(form.getContentId());
		
		return "redirect:/complete";
	}
	
}

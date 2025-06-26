package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.ToDoList;
import com.example.demo.form.ToDoSearchForm;
import com.example.demo.service.ToDoListService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ToDoController {
	
	private final ToDoListService service;

	//トップページリクエスト
	@GetMapping("/todo-top")
	public String showToDo(
			@ModelAttribute ToDoSearchForm form) {
		
		return "todo-top";
	}
	
	//検索リクエスト
	@PostMapping("/search-todo")
	public String searchToDo(
			@ModelAttribute ToDoSearchForm form,
			Model model) {
		
		List<ToDoList> list = service.findByUserId(form.getUserId());
		
		model.addAttribute("todolist", list);
		
		return "todo-top";
		
	}
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ToDoEditForm;

@Controller
public class ToDoEditController {

	@PostMapping("/todo-edit")
	public String editToDo(@ModelAttribute ToDoEditForm form) {
		
		return "todo-edit";
	}
	
}

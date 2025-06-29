package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ToDoFinishForm;

@Controller
public class FinishController {

	@PostMapping("/finish-todo")
	public String FinishToDo(@ModelAttribute ToDoFinishForm form) {
		return "finish-todo";
	}
}

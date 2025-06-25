package com.example.demo.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.ToDoList;
import com.example.demo.form.ToDoSearchForm;

@Controller
public class ToDoController {

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
		
		List<ToDoList> list = new ArrayList<ToDoList>();
		
		//testdata
		//data 1
		ToDoList todolist = new ToDoList();
		todolist.setContentId(1);
		todolist.setUserId("testuser1");
		todolist.setTitle("test");
		todolist.setContent("hogehoge");
		todolist.setNotes("hogehoge");
		todolist.setLimitDate(Date.valueOf("2025-06-25"));
		todolist.setPlace("地球");
		todolist.setRegistDate(Date.valueOf("2025-06-24"));
		list.add(todolist);
		//data 2
		todolist = new ToDoList();
		todolist.setContentId(2);
		todolist.setUserId("testuser2");
		todolist.setTitle("testing");
		todolist.setContent("fugafuga");
		todolist.setNotes("fugafuga");
		todolist.setLimitDate(Date.valueOf("2025-06-20"));
		todolist.setPlace("earth");
		todolist.setRegistDate(Date.valueOf("2025-06-01"));
		list.add(todolist);
		//testdata end
		
		model.addAttribute("todolist", list);
		
		return "todo-top";
		
	}
}

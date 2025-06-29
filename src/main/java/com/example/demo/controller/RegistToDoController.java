package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.ToDoList;
import com.example.demo.form.ToDoRegistForm;
import com.example.demo.service.ToDoRegistService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegistToDoController {
	
	private final ToDoRegistService service;
	
	@GetMapping("/regist-todo")
	public String ShowRegistForm(Model model) {
		model.addAttribute("toDoRegistForm", new ToDoRegistForm());
		
		return "regist-todo";
	}

	@PostMapping("/regist-todo")
	public String RegistToDoTop(
			@Validated ToDoRegistForm form,
			BindingResult result,
			RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()) {
			return "regist-todo";
		}
		
		ToDoList todo = new ToDoList();
		todo.setUserId(form.getUserId());
		todo.setTitle(form.getTitle());
		todo.setContent(form.getContent());
		todo.setNotes(form.getNotes());
		todo.setLimitDate(form.getLimitDate());
		todo.setPlace(form.getPlace());
		service.regist(todo);
		
		redirectAttributes.addFlashAttribute("msg", "ToDo登録");
		
		return "redirect:/complete";
	}
	
}

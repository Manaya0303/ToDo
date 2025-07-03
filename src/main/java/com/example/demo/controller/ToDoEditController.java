package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.ToDoList;
import com.example.demo.form.ToDoEditForm;
import com.example.demo.service.ToDoEditService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ToDoEditController {
	
	private final ToDoEditService service;
	
	@GetMapping("/todo-edit")
	public String showEditToDo() {
		return "todo-edit";
	}

	@PostMapping("/todo-edit")
	public String editToDo(
			@Validated ToDoEditForm form,
			BindingResult result,
			RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return "todo-edit";
		}
		
		ToDoList todo = new ToDoList();
		todo.setContentId(form.getContentId());
		todo.setTitle(form.getTitle());
		todo.setContent(form.getContent());
		todo.setNotes(form.getNotes());
		todo.setLimitDate(form.getLimitDate());
		todo.setPlace(form.getPlace());
		
		service.edit(todo);
		
		redirectAttributes.addFlashAttribute("msg","ToDo編集");
		
		return "redirect:/complete";
	}
	
}

package com.example.demo.form;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class ToDoRegistForm {

	@NotNull(message="入力してください")
	private String UserId;
	
	@NotNull(message="入力してください")
	@Size(min=1, max=16, message="16文字以内で入力してください")
	private String title;
	
	@NotNull(message="入力してください")
	@Size(min=1, max=64, message="64文字以内で入力してください")
	private String content;
	
	@Size(min=0, max=32, message="32文字以内で入力してください")
	private String notes;
	
	@FutureOrPresent
	private LocalDate limitDate;
	
	@Size(min=0, max=16, message="16文字以内で入力してください")
	private String place;
	
}

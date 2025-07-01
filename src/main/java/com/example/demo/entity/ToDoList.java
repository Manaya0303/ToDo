package com.example.demo.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ToDoList {

	private int contentId;
	private String userId;
	private String title;
	private String content;
	private String notes;
	private LocalDate limitDate;
	private String place;
	private Timestamp registDate;
	private boolean status;
}

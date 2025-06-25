package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class ToDoList {

	private int contentId;
	private String userId;
	private String title;
	private String content;
	private String notes;
	private Date limitDate;
	private String place;
	private Date registDate;
}

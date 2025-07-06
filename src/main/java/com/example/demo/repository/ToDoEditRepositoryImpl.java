package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ToDoList;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ToDoEditRepositoryImpl implements ToDoEditRepository {

	private final JdbcTemplate jdbcTemplate;
	
	@Override
	public void update(ToDoList todolist) {

		String sql =
				"UPDATE                " +
				"	todo_list          " +
				"SET                   " +
				"	title = ?,         " +
				"	content = ?,       " +
				"	notes = ?,         " +
				"	limit_date = ?,    " +
				"	place = ?          " +
				"WHERE                 " +
				"	content_id = ?     ";
		
		jdbcTemplate.update(sql,
				todolist.getTitle(),
				todolist.getContent(),
				todolist.getNotes(),
				todolist.getLimitDate(),
				todolist.getPlace(),
				todolist.getContentId());

	}

}

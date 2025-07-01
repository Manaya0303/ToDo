package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ToDoFinishRepositoryImpl implements ToDoFinishRepository {

	private final JdbcTemplate jdbcTemplate;
	
	@Override
	public void finish(int contentId) {
		
		String sql =
				"UPDATE                 " +
				"	todo_list           " +
				"SET                    " +
				"	status = 1          " +
				"WHERE                  " +
				"	content_id = ?      ";
		
		jdbcTemplate.update(sql, contentId);
		

	}

}

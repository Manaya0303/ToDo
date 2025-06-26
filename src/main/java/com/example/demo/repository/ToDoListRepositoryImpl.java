package com.example.demo.repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ToDoList;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ToDoListRepositoryImpl implements ToDoListRepository {

	private final JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ToDoList> selectByUserId(String userId) {
		
		String sql =
				"SELECT                     " +
				"	content_id,             " +
				"	user_id,                " +
				"	title,                  " +
				"	content,                " +
				"	notes,                  " +
				"	limit_date,             " +
				"	place,                  " +
				"	regist_date             " +
				"FROM                       " +
				"	todo_list               " +
				"WHERE                      " +
				"	user_id LIKE ?          " +
				"ORDER BY                   " +
				"	limit_date ASC,         " +
				"	content_id DESC         ";
		
		String p = "%" + userId + "%";
		
		List<Map<String, Object>> list
						=jdbcTemplate.queryForList(sql, p);
		
		List<ToDoList> result = new ArrayList<ToDoList>();
		for(Map<String, Object> one : list) {
			ToDoList todo = new ToDoList();
			todo.setContentId((int)one.get("content_id"));
			todo.setUserId((String)one.get("user_id"));
			todo.setTitle((String)one.get("title"));
			todo.setContent((String)one.get("content"));
			todo.setNotes((String)one.get("notes"));
			todo.setLimitDate((Date)one.get("limit_date"));
			todo.setPlace((String)one.get("place"));
			todo.setRegistDate((Timestamp)one.get("regist_date"));
			result.add(todo);
			
		}
		
		return result;
	}

}

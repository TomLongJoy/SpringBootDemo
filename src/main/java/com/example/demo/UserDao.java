package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void save(User use) {
		
		String sqlString = String.format("insert into User (name) values('%s')", use.getName());
		System.out.println("zlj" + sqlString);
		jdbcTemplate.batchUpdate(sqlString);
	}

}

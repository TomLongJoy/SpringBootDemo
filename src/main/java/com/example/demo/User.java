package com.example.demo;

public class User {

	private Integer userId;
	private String name;
	
	public User(String name2) {
		this.name = name2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
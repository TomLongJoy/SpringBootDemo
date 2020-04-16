package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	@Autowired
	private UserserviceImpl userservice;
	@RequestMapping("/save")
	public String save(String name) {
		User user = new User(name);
		userservice.save(user);
		return "save successfully!";
	}
}

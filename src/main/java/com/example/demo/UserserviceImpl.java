package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserserviceImpl implements Userservice {

	@Autowired
	private UserDao dao;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}

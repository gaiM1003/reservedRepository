package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Studio;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public Studio view(long id) {
		return userMapper.view(id);
		
	}

}

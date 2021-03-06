package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudioMapper;
import com.example.demo.model.Studio;

@Service
public class ReservedService {
	
	@Autowired
	StudioMapper studioMapper;
	
	public Studio view() {
		return studioMapper.view();
		
	}

}

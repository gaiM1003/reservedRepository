package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.test.AppleInterface;

@Service
public class FatherService implements AppleInterface{

		public String execute() {
			return "お父さん";
		}

	
}

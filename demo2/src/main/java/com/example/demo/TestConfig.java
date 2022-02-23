package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.MotherService;
import com.example.test.AppleInterface;

@Configuration
public class TestConfig {
	
	@Bean
	AppleInterface appleInterface() {
		return new MotherService();		
	}

}

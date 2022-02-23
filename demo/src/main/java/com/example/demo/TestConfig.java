package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.controller.SonemTestController;
import com.example.demo.service.SonemService;
import com.example.demo.service.TestService;
import com.example.test.AppleInterface;

@Configuration
public class TestConfig {

	
	@Bean
	@Primary
	AppleInterface sonemServiceb() {
		return new SonemService();
	}
	
	@Bean
	AppleInterface testServiceb() {
		return new TestService();
		
	}
	

}

package com.example.demo.controller;
//フィールドインジェクション
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.AppleInterface;

@Controller
@RequestMapping("/books2")
public class SonemTestController2 {
	@Autowired
	AppleInterface appleInterface;

	@GetMapping
	public String view() {
		System.out.println(appleInterface.execute());
		
		return appleInterface.execute();
	}
}

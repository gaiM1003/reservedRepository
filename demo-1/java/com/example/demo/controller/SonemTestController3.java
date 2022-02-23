package com.example.demo.controller;
//セッターインジェクション
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.AppleInterface;

@Controller
@RequestMapping("/books")
public class SonemTestController3 {

	AppleInterface appleInterface;
	
	@Autowired
	public void setController3(AppleInterface appleInterface) {
		this.appleInterface = appleInterface;
	}

	@GetMapping
	public String view() {
		System.out.println(appleInterface.execute());
		
		return appleInterface.execute();
	}
}

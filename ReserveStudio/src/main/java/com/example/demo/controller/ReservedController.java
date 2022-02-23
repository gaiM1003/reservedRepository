package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservedController {
	
	@Autwired
	StudioService studioService;
	
	@GetMapping(value = "/studio")
	public String getStudio(){
		
	return "studio";
	}

	@GetMapping(value = "/reserve")
	public String getReserve(Model model){
		studioService.view();
	return "reserve";
	}

}

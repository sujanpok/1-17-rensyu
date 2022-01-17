package com.example.demo.conn;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/info")
public class MainCon {

	@GetMapping("/user")
	public String getUser() {
		return "user";
	}
	
	@GetMapping("/demo")
	public String getdemo() {
		return "demo";
	}
	
}

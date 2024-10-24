package com.example.baseball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user/signup")
	public String userSignUp() {
		return "user/signup";
	}
	
	@GetMapping("/user/login")
	public String userLogin() {
		return "user/login";
	}
	
}

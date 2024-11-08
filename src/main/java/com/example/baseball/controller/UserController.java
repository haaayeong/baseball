package com.example.baseball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.baseball.dto.ResponseDTO;

@Controller
public class UserController {

	@GetMapping("/user/signup")
	public String userSignUp() {
		return "user/signup";
	}
	
	@PostMapping("/user/signup")
	@ResponseBody
	public ResponseDTO<?> insertUser()
	
	@GetMapping("/user/login")
	public String userLogin() {
		return "user/login";
	}
	
}

package com.example.baseball.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.baseball.domain.UserInfo;
import com.example.baseball.dto.ResponseDTO;
import com.example.baseball.dto.UserDTO;
import com.example.baseball.repository.UserRepository;
import com.example.baseball.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final ModelMapper modelMapper;
	private final UserService userService;
	private final UserRepository userRepository;

	@GetMapping("/user/signup")
	public String userSignUp() {
		return "user/signup";
	}
	
	@PostMapping("/user/signup")
	@ResponseBody
	public ResponseDTO<?> insertUser(@Valid @RequestBody UserDTO userDTO, BindingResult bindingResult) {
		UserInfo userInfo = modelMapper.map(userDTO, UserInfo.class);
		
		UserInfo findUsername = userService.getUsername(userInfo.getUsername());
		UserInfo findNickname = userService.getNickname(userInfo.getNickname());
		
		if(findUsername.getUsername() == null) {
			if(findNickname.getNickname() == null) {
				userService.insertUser(userInfo);
				
				return new ResponseDTO<>(HttpStatus.OK.value(), "사용 가능한 아이디와 닉네임입니다.");
			} else {
				return new ResponseDTO<>(HttpStatus.BAD_REQUEST.value(), "중복된 닉네임입니다.");
			}
			
		} else {
			return new ResponseDTO<>(HttpStatus.BAD_REQUEST.value(), "중복된 아이디입니다.");
		}
		
						
	}
	
	@GetMapping("/user/login")
	public String userLogin() {
		return "user/login";
	}
	
}

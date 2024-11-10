package com.example.baseball.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.baseball.domain.RoleType;
import com.example.baseball.domain.UserInfo;
import com.example.baseball.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	@Transactional // DB에서 의도치 않은 값이 저장되거나 조회되는 것을 막을 수 있는 어노테이션
	public void insertUser(UserInfo userInfo) {
		userInfo.setRole(RoleType.USER); // 일단 회원가입되는 사람 모두 User 설정되게 해주셈.
		
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword())); // 패스워드 암호화
		
		userRepository.save(userInfo); // DB에 insert.
	}
	
	public UserInfo getUsername(String username) {
		UserInfo findUsername = userRepository.findByUsername(username).orElseGet(() -> {
			return new UserInfo();
		});
		
		return findUsername;
	}
	
	public UserInfo getNickname(String nickname) {
		UserInfo findNickname = userRepository.findByNickname(nickname).orElseGet(() -> {
			return new UserInfo();
		});
		
		return findNickname;
	}

}

package com.example.baseball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CommonConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
//		비밀번호를 암호화해주기 위함. Security 기능인데 따로 뺀 이유는 순환참조 오류 때문임.
		return new BCryptPasswordEncoder();
	}

}

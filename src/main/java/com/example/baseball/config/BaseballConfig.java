package com.example.baseball.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BaseballConfig implements WebMvcConfigurer{
	@Bean
	ModelMapper modelMapper() { // Entity와 Dto의 변환에 사용하는 거임.
		return new ModelMapper();
	}

}

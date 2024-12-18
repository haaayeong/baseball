package com.example.baseball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/", "/user/**", "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll().anyRequest().authenticated();
		
		http.csrf().disable();
		
		http.formLogin().loginPage("/user/login");
		
		http.logout().logoutUrl("/user/logout").logoutSuccessUrl("/");
		
		return http.build();
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	
	
}

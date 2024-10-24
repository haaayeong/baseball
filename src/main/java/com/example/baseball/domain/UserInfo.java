package com.example.baseball.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, unique = true, length = 20)
	private String username;
	
	@Column(nullable = false, length = 20)
	private String password;
	
	@Column(nullable = false, length = 30)
	private String nickname;
	
	private String email;
	
	@CreationTimestamp
	private Timestamp createDate;
	
	@Enumerated(EnumType.STRING)
	private RoleType role;// Roletype을 쓰려면 도메인을 따로 만들어줘야함...
	
}

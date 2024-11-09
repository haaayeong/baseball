package com.example.baseball.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baseball.domain.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{

	Optional<UserInfo> findByUsername(String username); // DB에서 아이디 찾기 위함.
	Optional<UserInfo> findByNickname(String nickname); // DB에서 닉네임 찾기 위함.
}

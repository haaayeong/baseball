package com.example.baseball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baseball.domain.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{

}

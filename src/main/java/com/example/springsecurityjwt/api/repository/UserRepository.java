package com.example.springsecurityjwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurityjwt.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}

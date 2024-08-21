package com.example.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshopping.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
package com.de110.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.de110.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);
}

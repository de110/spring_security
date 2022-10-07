package com.test.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.security.entity.User;

@Repository
<<<<<<< HEAD
public interface UserRepository extends JpaRepository<User, Long> {
=======
public interface UserRepository extends JpaRepository<User,Long>{
>>>>>>> 498e101719349a9764fc520e948ba3d2d9e9712a
    Optional<User> findByUserName(String userName);
}

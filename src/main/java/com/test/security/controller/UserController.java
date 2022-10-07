package com.test.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.security.entity.User;
import com.test.security.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    // 회원 가입
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        user = User.builder().userName(user.getUsername()).password(passwordEncoder.encode(user.getPassword()))
                .role("USER").build();
        return userService.saveUser(user);
    }

    @PostMapping("/user")
    public UserDetails login(@RequestBody User user) {
        return userService.loadUserByUsername(user.getUsername());
    }

    @GetMapping("/loging")
    public Object currentUser(@AuthenticationPrincipal User user) {
        // Authentication authentication =
        // SecurityContextHolder.getContext().getAuthentication();

        // User user = (User) authentication.getPrincipal();

        return user;
    }
}

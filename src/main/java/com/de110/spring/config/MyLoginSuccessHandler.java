package com.de110.spring.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class MyLoginSuccessHandler implements AuthenticationSuccessHandler {

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication)
            throws IOException, ServletException {

        response.sendRedirect("/hello");
    }
}

// DB saving test
// MVC system mark out
// AuthenticationPrincipal annotation ~> check DB saving
// build vue front
// check DB save in vue front env.
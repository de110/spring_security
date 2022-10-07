package com.de110.spring.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PATCH");
    }

    // @Override
    // public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    // registry.addResourceHandler("/**")
    // .addResourceLocations("classpath:/templates/")
    // .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
    // }

    // public void addViewControllers(ViewControllerRegistry registry) {
    // registry.addViewController("/home").setViewName("home");
    // registry.addViewController("/").setViewName("home");
    // registry.addViewController("/hello").setViewName("hello");
    // registry.addViewController("/login");
    // }

}
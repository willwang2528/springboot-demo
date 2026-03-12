package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from OpenClaw! 🦞";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id) {
        return userService.getUser(id);
    }
}

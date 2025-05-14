package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins= "http://localhost:3001")
public class UserController {
	@Autowired
private UserService userservice;

	
	@PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userservice.registerUser(user.getName(), user.getEmail(), user.getPassword());
    }

    @PostMapping("/loginuser")
    public String loginUser(@RequestBody User user) {
        return userservice.loginUser(user.getEmail(), user.getPassword());
    }
}




package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	 String registerUser(String name, String email, String password);
	 String loginUser(String email, String password);
}
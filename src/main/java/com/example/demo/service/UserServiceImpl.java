package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class  UserServiceImpl implements UserService{
	@Autowired
	UserRepository userrepo;


	 @Override
	    public String registerUser(String name, String email, String password) {
	        User user = new User(name, email, password);
	        userrepo.save(user);
	        return "User registered successfully";
	    }

	    @Override
	    public String loginUser(String email, String password) {
	        User user = userrepo.findByEmail(email);
	        if (user != null && user.getPassword().equals(password)) {
	            return "Login successful";
	        } else {
	            return "Invalid email or password";
	        }
}
}
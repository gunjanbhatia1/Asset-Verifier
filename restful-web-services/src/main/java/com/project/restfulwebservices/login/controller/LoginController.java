package com.project.restfulwebservices.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.restfulwebservices.login.dao.UserDao;
import com.project.restfulwebservices.login.service.UserService;
import com.project.restfulwebservices.login.model.User;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginController {
	
	@Autowired
	UserService userService;

	
//	To register the user
	@RequestMapping(value="/asset/signUp",method = RequestMethod.POST)
	public User signUp(@RequestBody User user) {
		userService.create(user);
		System.out.println("created");
		return user;
	}
	
//	For login
	@RequestMapping(value = "/asset/login", method = RequestMethod.POST)
	public User login(@RequestBody User loginUser) {
		
		User user2 = userService.findByEmail(loginUser.getEmail());
		
		
		if (user2 == null) {
			System.out.println("hi");
			return null;
		}
		
		String s1 = user2.getPassword();
		String s2 = loginUser.getPassword();
		if (!s1.equals(s2)) {
			System.out.println("not matching");
			return null;
		}
		
		return user2;
	}
}
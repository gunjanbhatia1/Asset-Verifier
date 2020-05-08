package com.project.restfulwebservices.login.service;

import com.project.restfulwebservices.login.model.User;

public interface UserService {
	
	public void create(User user);
	
	public User findByEmail(String email);
	
	//public void updatePassword(String password,String email);

}
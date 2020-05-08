package com.project.restfulwebservices.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.restfulwebservices.login.dao.UserDao;
import com.project.restfulwebservices.login.service.UserService;
import com.project.restfulwebservices.login.model.User;



@Service("userService")
@Transactional(rollbackFor=Exception.class)
public class UserServiceImp implements UserService{

	@Autowired
	UserDao userDao;
	

	@Override
	public void create(User user) {
		userDao.save(user);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

//	@Override
//	public void updatePassword(String password, String email) {
//		userDao.updatePassword(password, email);
//		
//	}

}
package com.project.restfulwebservices.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.restfulwebservices.login.model.User;



@Repository("userDao")
public interface UserDao extends JpaRepository<User,Integer>{
	
	public User findByEmail(String email);
	
	//@Modifying
//	@Query(value="UPDATE user_information SET password=?1 where email=?2",nativeQuery=true)
//	public void updatePassword(String password,String email);

}
package com.project.restfulwebservices;
import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.restfulwebservices.uploadfiles.storage.StorageService;

@SpringBootApplication
//@EnableJpaRepositories(basePackages= { "com.project.restfulwebservices.login.dao"})
//@ComponentScan({" com.project.restfulwebservices"})
//@EntityScan({" com.project.restfulwebservices.login.model"})

public class RestfulWebServicesApplication  {

	
	@Resource
  StorageService storageService;
	 
	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	

	  public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
  }

}

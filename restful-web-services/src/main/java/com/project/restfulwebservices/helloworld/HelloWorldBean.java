package com.project.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.setMessage(message);
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

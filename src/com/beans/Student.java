package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
 
public class Student {
	
	@Value("krishna")
	private String name;
	
	@Value("Mayapur")
	private String city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getName() {
		return name;
	}
	
	

}

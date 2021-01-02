package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
public class Customer {
	
	//@Value("Govind")
	private String name;
	
	@Value("kolkata")
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("Customer constructor");
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

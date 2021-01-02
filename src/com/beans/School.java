package com.beans;

public class School {
	
	private String name;
	
	private String city;
	
	public School() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside schoo; constructor:::");
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

package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Customer;

@Configuration
public class applicationContext {
	
	public applicationContext() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(name="cust")
	public Customer	 getCustomer() {
		Customer cust = new Customer();
		cust.setName("GodKrishna");
		return cust;
	}

}

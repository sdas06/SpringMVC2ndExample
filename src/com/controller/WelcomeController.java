package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.beans.Customer;
import com.beans.Student;

public class WelcomeController implements Controller {
	
	@Autowired
	private Student stu;
	
	 
	private Customer cust;

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Name is "+stu.getName());
		System.out.println("Customer name is --"+cust.getName());
		String name = req.getParameter("name");
		Map mv = new HashMap();
		mv.put("msg","Welcome ..."+name);
		ModelAndView modelView = new ModelAndView("welcome", mv);
		return modelView; 
		 
		
		 
	}
	
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public Customer getCust() {
		return cust;
	}

}

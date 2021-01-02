package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.beans.Customer;
import com.beans.School;
import com.beans.Student;

public class HiController implements Controller{
	
	private Customer customer;
	
	private School school;
	
	private Student student;
	 

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Customer Name is -->"+customer.getName());
		//System.out.println("School name is -->"+school.getName());
		System.out.println("Student name is --->"+student.getName());
		String schoolName = req.getParameter("schoolName");
		Map m = new HashMap();
		m.put("msg", "Hi...."+schoolName);
		ModelAndView mv = new ModelAndView("yes", m);
		return mv;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	 

}

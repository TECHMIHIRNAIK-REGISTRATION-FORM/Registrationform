package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserRepo;

@Controller
public class RegisterController 
{
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/Regform")
	public String Register()
	{
		return "/views/registration.jsp";
	}
	@RequestMapping("/showdetail")
	public 	String show(registrationapplication ra)
	{
		repo.save(ra);
		return "/views/showdetails.jsp";
		
		

}
	

}

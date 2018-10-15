package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	@RequestMapping("/msg")
	public String showMsgA(){
		System.out.println("in controller");
		return "msg";
	}
	@RequestMapping(value="/userReg")
	public String displayUserRegPage(ModelMap map){
		map.addAttribute("user",new User());
		return "UserRegistration";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user")User u,ModelMap map){
		int i=service.saveUser(u);
		
		String msg="User '"+i+"'saved successfully...!";
		map.addAttribute("message",msg);
		return "UserRegistration";
	}
}

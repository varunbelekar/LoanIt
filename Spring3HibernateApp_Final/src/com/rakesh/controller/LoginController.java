package com.rakesh.controller;

import java.util.Map;

import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakesh.bean.LoginForm;
import com.rakesh.service.UserService;

@Controller
@RequestMapping("loginform.html")
public class LoginController {

	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			Map model) {

		
		if (result.hasErrors()) {
			return "loginform";
		}
		
		boolean userExists = false;
		try
		{
		userExists = userService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		if(userExists){
			model.put("loginForm", loginForm);
			return "loginsuccess";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}
	
	
	
}

package com.rakesh.controller;

import java.util.Map;

import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakesh.bean.Registration;
import com.rakesh.bean.UsersBean;
import com.rakesh.model.Users;
import com.rakesh.service.RegistrationService;

@Controller
@RequestMapping("/registrationform.html")
public class RegistrationController {
	
	
	
	@Autowired
	private RegistrationService registrationService;

	@Autowired
	private RegistrationValidation registrationValidation;

	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	public void setRegistrationValidation(RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}

	// Display the form on the get request
	   
		@RequestMapping(method = RequestMethod.GET)
		public String showRegistration(Map model) {
			Registration registration = new Registration();
			model.put("registration", registration);
			return "registrationform";
		}
		
		// Process the form.
		@RequestMapping(method = RequestMethod.POST)
		public String processRegistration(@ModelAttribute("command") UsersBean usersBean,@Valid Registration registration,
				BindingResult result) {
			// set custom Validation by user
			Users users = prepareModelUser(usersBean);
			registrationValidation.validate(registration, result);
			if (result.hasErrors()) {
				return "registrationform";
			}
			else
			{
				try
				{
					registrationService.addUsers(users);
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			
			return "registrationsuccess";
		}
		private Users prepareModelUser(UsersBean usersBean){
			Users users = new Users();
			users.setId(usersBean.getId());
			users.setUserName(usersBean.getUserName());
			users.setUserPassword(usersBean.getPassword());
			return users;
		}
}

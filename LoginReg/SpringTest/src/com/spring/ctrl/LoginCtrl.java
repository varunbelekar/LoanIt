package com.spring.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.spring.service.AuthService;

@Controller
@RequestMapping("/user")
public class LoginCtrl {
	
	@Autowired
	private AuthService authService;
	
	@RequestMapping(value="/validate" , method=RequestMethod.POST)
	public ModelAndView validateUser(@RequestParam("userName")String userName, 
										@RequestParam("password")String password) {
		String msg="";
		boolean isValid = authService.findUser(userName, password);
		
		if(isValid) {
			msg = "Welcome" + userName + " !"	;
		}else {
			msg = "Invalid Credentials";
		}
		
		return new ModelAndView("result", "output", msg);
	}
	

}

package com.yash.damsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.damsapp.domain.User;
import com.yash.damsapp.service.UserService;

/**
 * UserController is used to controls various activities related to user
 * @author saloni.jain
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	 @RequestMapping(value="/home", method=RequestMethod.GET)
	  public String showHomePage() {
 		return "home";
	  }
	 
	 @RequestMapping(value="/userRegistration", method=RequestMethod.GET)
	  public String showUserRegistration() {
		return "userRegistration";
	  }
 
	 @RequestMapping(value="/processUserRegistration", method=RequestMethod.POST)
	  public String processUserRegistration(@ModelAttribute("user") User user) {
		 userService.register(user);
		return "home";
	  }
	

}

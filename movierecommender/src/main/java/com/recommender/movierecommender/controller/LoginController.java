package com.recommender.movierecommender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.recommender.movierecommender.model.Users;
import com.recommender.movierecommender.service.UserService;

@Controller
public class LoginController {
	
	@Autowired 
	UserService userService;
	
	@GetMapping("/login")
	public String login(ModelMap map) {
		return "login";
		// Returns login.jsp
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelMap model) {
		boolean isValidUser = false;
		try {
			isValidUser = userService.findByUsername(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Testtttttt" + isValidUser);
		if (isValidUser) {
			model.addAttribute(username);
			model.addAttribute(password);
			return "welcome";
		}
		return "login";
	}

}

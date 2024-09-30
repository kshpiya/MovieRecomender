package com.recommender.movierecommender.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@PostMapping("/login")
	public int login(@RequestParam("username") String userbame, @RequestParam("password") String password) {
		
		return 0;
		
	}
}

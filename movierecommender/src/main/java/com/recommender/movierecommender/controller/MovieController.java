package com.recommender.movierecommender.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MovieController {
	@PostMapping("/create")
	public int createMovie(@RequestParam("username") String userbame, @RequestParam("password") String password) {
		
		return 0;
		
	}

}

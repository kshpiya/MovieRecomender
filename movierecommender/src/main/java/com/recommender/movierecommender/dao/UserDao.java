package com.recommender.movierecommender.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recommender.movierecommender.model.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
}

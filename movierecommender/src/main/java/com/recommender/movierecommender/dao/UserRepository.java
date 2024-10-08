package com.recommender.movierecommender.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recommender.movierecommender.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	Users findByUsername(String username);
}

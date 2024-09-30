package com.recommender.movierecommender.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recommender.movierecommender.model.Movies;

public interface MovieDao extends JpaRepository<Movies, Long> {
	List<Movies> findByMovieName(String title);
	
}

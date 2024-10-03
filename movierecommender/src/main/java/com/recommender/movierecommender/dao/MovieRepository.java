package com.recommender.movierecommender.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recommender.movierecommender.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}

package com.recommender.movierecommender.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommender.movierecommender.dao.MovieRepository;
import com.recommender.movierecommender.model.Movie;

@Service
public class MovieService {

	 @Autowired
	    private MovieRepository movieRepository;

	    public Movie saveMovie(Movie movie) {
	        return movieRepository.save(movie);
	    }

	    public List<Movie> getAllMovies() {
	        return movieRepository.findAll();
	    }
}

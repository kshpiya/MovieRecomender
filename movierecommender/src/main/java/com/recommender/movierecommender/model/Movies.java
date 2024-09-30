package com.recommender.movierecommender.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name="Movies")
@Data
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String title;
	String description;
	String director;
	List<String> actors;
	String ratings;
	String genre;
}

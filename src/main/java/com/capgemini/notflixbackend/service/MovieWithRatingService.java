package com.capgemini.notflixbackend.service;


import com.capgemini.notflixbackend.model.MovieWithRating;

public interface MovieWithRatingService {
    Iterable<MovieWithRating> findAll();
    MovieWithRating saveMovie(MovieWithRating movie);
    //Movie findByTitle(String title);
}

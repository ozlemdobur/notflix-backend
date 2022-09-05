package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.Movie;

public interface MovieService {
    Iterable<Movie> findAll();
    Movie saveMovie(Movie movie);
    Movie findByTitle(String title);
}

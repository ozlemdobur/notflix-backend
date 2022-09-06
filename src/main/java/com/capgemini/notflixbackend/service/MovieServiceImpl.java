package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    public MovieServiceImpl() {
    }

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Iterable<Movie> findAll() {
        Iterable<Movie> movies = movieRepository.findAll();
        return movies;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        Movie newMovie = movieRepository.save(movie);
        return newMovie;
    }

/*    @Override
    public Movie findByTitle(String title) {
        Movie movie = movieRepository.findByTitle(title);
        return movie;
    }*/
}

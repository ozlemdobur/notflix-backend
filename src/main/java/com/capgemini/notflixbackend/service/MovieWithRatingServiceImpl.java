package com.capgemini.notflixbackend.service;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.model.MovieWithRating;
import com.capgemini.notflixbackend.repository.MovieRepository;
import com.capgemini.notflixbackend.repository.MovieWithRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieWithRatingServiceImpl implements MovieWithRatingService {
    private MovieWithRatingRepository movieWithRatingRepository;

    public MovieWithRatingServiceImpl() {
    }

    @Autowired
    public MovieWithRatingServiceImpl(MovieWithRatingRepository movieWithRatingRepository) {
        this.movieWithRatingRepository = movieWithRatingRepository;
    }


    @Override
    public Iterable<MovieWithRating> findAll() {
        Iterable<MovieWithRating> movies = movieWithRatingRepository.findAll();
        return movies;
    }

    @Override
    public MovieWithRating saveMovie(MovieWithRating movie) {
        MovieWithRating newMovie = movieWithRatingRepository.save(movie);
        return newMovie;
    }
}

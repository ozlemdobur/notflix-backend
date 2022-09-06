package com.capgemini.notflixbackend.controller;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

@RestController
@RequestMapping(value = "api")
public class MovieController {

    private MovieService movieService;

    public MovieController() {
    }

    @Autowired
    public MovieController(MovieService movieService) {

        this.movieService = movieService;

    }

    @CrossOrigin
    @GetMapping(value = "/movies")
    public ResponseEntity<Iterable<Movie>> getAllMovies() {

        Iterable<Movie> movies = movieService.findAll();
        return ResponseEntity.ok(movies);

    }

    @PostMapping(value = "/movies")
    public ResponseEntity<Movie> saveMovie(Movie movie)  {

        Movie movies = movieService.saveMovie(movie);

        return ResponseEntity.ok(movie);

    }

}

package com.capgemini.notflixbackend.controller;


import com.capgemini.notflixbackend.model.MovieWithRating;
import com.capgemini.notflixbackend.service.MovieService;
import com.capgemini.notflixbackend.service.MovieWithRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api")
public class MovieWithRatingController {

    private MovieWithRatingService movieService;

    public MovieWithRatingController() {
    }

    @Autowired
    public MovieWithRatingController(MovieWithRatingService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin
    @GetMapping(value = "/moviesWithRating")
    public ResponseEntity<Iterable<MovieWithRating>> getAllMovies() {

        Iterable<MovieWithRating> movies = movieService.findAll();
        return ResponseEntity.ok(movies);

    }
    @CrossOrigin
    @PostMapping(value = "/moviesWithRating")
    public ResponseEntity<MovieWithRating> saveMovie(@RequestBody MovieWithRating movie)  {
        System.out.println(movie.toString());
        MovieWithRating movies = movieService.saveMovie(movie);

        return ResponseEntity.ok(movie);

    }
}

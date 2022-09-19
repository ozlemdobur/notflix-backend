package com.capgemini.notflixbackend.repository;

import com.capgemini.notflixbackend.model.MovieWithRating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieWithRatingRepository extends CrudRepository<MovieWithRating,Long> {
}

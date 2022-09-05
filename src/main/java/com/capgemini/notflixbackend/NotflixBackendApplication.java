package com.capgemini.notflixbackend;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class NotflixBackendApplication implements CommandLineRunner {

	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(NotflixBackendApplication.class, args);
		//System.out.println("Merhaba");
	}

	@Override
	public void run(String... args) throws Exception {

		Movie movie = new Movie(null, "Like", "Jascha Washington", 6.5F,
				"Comedy,Drama,Family",
				"  Die-hard hoops fan Jerome Jenkins Junior gets no respect at the local court, ",
				"https://www.youtube.com/embed/gfZWzD7COwo?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx");
		movieRepository.save(movie);

	}
}
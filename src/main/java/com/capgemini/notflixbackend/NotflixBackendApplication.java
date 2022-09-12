package com.capgemini.notflixbackend;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.model.User;
import com.capgemini.notflixbackend.repository.MovieRepository;
import com.capgemini.notflixbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;


@SpringBootApplication
public class NotflixBackendApplication implements CommandLineRunner {

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(NotflixBackendApplication.class, args);
		//System.out.println("Merhaba");
	}

	@Override
	public void run(String... args) throws Exception {

		Movie movie = new Movie(null, "Like", "Jascha Washington", 6.5F,
				"Comedy,Drama,Family",
				"  Die-hard hoops fan Jerome Jenkins Junior gets no respect at the local court, ",
				"\\assets\\pictures\\1.jpg",
				"https://www.youtube.com/embed/gfZWzD7COwo?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
				);
		movieRepository.save(movie);

			movie = new Movie(null, "Tyler Perry's Madea Goes to Jail", "Tyler Perry,Derek Luke", 6.5F,
				"Comedy,Drama,Thriller",
					"After a high-speed freeway chase puts Madea (TYLER PERRY) in front of the judge, her reprieve is short-lived as anger management issues get the best of her and land her in jail.",
					"\\assets\\pictures\\2.jpg",
					"https://www.youtube.com/embed/1cNBV3LG5n0"
					);
		movieRepository.save(movie);

		movie = new Movie(null, "Little Nicky", "Adam Sandler,Patricia Arquette", 6.5F,
				"Comedy,Romance",
				"When Satan reneges on his plans to retire, two of his three heirs leave Hell for New York City to gather enough souls to vote the Prince of Darkness out of office.",
				"\\assets\\pictures\\3.jpg",
				"https://www.youtube.com/embed/Z23JeEtzTUM?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx" );
		movieRepository.save(movie);

		movie = new Movie(null, "13 Hours: The Secret Soldiers of Benghazi", "James Badge Dale,Max Martini", 6.5F,
				"Drama",
				"From director Michael Bay, 13 HOURS: THE SECRET SOLDIERS OF BENGHAZI is the gripping true story of six elite ex-military operators assigned to protect the CIA.",
				"\\assets\\pictures\\4.jpg",
				"https://www.youtube.com/embed/YDZgtl4OsXk?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Tim Burton's Corpse Bride" , "Johnny Depp,Helena Bonham Carter", 6.5F,
				"Comedy,Drama,Horror,Romance,Mystery",
				"Returning to the painstaking stop-motion animation he employed with amazing success in The Nightmare Before Christmas.",
				"\\assets\\pictures\\7.jpg",
				"https://www.youtube.com/embed/9l9Se-4QbdY?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
				);
		movieRepository.save(movie);

		User user = new User(null, "molveno", "1", "Gabriel M");
		userRepository.save(user);

	}
}
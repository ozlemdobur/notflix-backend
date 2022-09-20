package com.capgemini.notflixbackend;

import com.capgemini.notflixbackend.model.Movie;
import com.capgemini.notflixbackend.model.MovieWithRating;
import com.capgemini.notflixbackend.model.User;
import com.capgemini.notflixbackend.repository.MovieRepository;
import com.capgemini.notflixbackend.repository.MovieWithRatingRepository;
import com.capgemini.notflixbackend.repository.UserRepository;
import com.capgemini.notflixbackend.service.MovieWithRatingService;
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

	@Autowired
	MovieWithRatingRepository movieWithRatingRepository;

	public static void main(String[] args) {
		SpringApplication.run(NotflixBackendApplication.class, args);
		//System.out.println("Merhaba");
	}

	@Override
	public void run(String... args) throws Exception {



		Movie movie = new Movie(null, "It Takes Two", "Kirstie Alley", 5.9F,
				"Comedy,Family,Romance",
				"Alyssa and Amanda are two little girls who are identical, but complete strangers, that accidentally meet one day.",
				"\\assets\\pictures\\itt.jpg",
				"https://www.youtube.com/embed/yh1OH4NnLWQ"
				);
		movieRepository.save(movie);


		movie = new Movie(null, "Silenced Stephen Curry Documentary" , "Stephen Curry", 6.5F,
				"Documentary,Short,Sport",
				"SILENCED, is an original documentary about Stephen Curry and the Golden State Warriors' historic 2022 season and NBA Finals Run.",
				"\\assets\\pictures\\st.jpg",
				"https://www.youtube.com/embed/2ZuWSiWQLN0"
		);
		movieRepository.save(movie);

		movie = new Movie(null, "Space Jam New Legacy" , "Lebron James", 6.5F,
				"Animation,Adventure,Comedy",
				"A rogue artificial intelligence kidnaps the son of famed basketball player LeBron James, who then has to work with Bugs Bunny to win a basketball game.",
				"\\assets\\pictures\\leb.jpg",
				"https://www.youtube.com/embed/olXYZOsXw_o"
		);
		movieRepository.save(movie);

			movie = new Movie(null, "Tyler Perry's Madea Goes to Jail", "Tyler Perry,Derek Luke", 4.4F,
				"Comedy,Drama,Thriller",
					"Mischievous grandma Madea lands in jail, where she meets a variety of mixed-up characters.",
					"\\assets\\pictures\\2.jpg",
					"https://www.youtube.com/embed/61AeW3d3fWo"
					);
		movieRepository.save(movie);

		movie = new Movie(null, "Little Nicky", "Adam Sandler,Patricia Arquette", 5.3F,
				"Comedy,Romance",
				"When Satan reneges on his plans to retire, two of his three heirs leave Hell for New York City to gather enough souls to vote the Prince of Darkness out of office.",
				"\\assets\\pictures\\3.jpg",
				"https://www.youtube.com/embed/TAnaPiJ5Sls");
		movieRepository.save(movie);

		movie = new Movie(null, "13 Hours: The Secret Soldiers of Benghazi", "James Badge Dale,Max Martini", 6.5F,
				"Drama",
				"From director Michael Bay, 13 HOURS: THE SECRET SOLDIERS OF BENGHAZI is the gripping true story of six elite ex-military operators assigned to protect the CIA.",
				"\\assets\\pictures\\4.jpg",
				"https://www.youtube.com/embed/pAwoA-XPzsQ"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 5.7F,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/I2L1-ASr1Es"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Faster" , "Dwayne Johnson,Billy Bob Thornton", 6.4F,
				"Action,Crime,Drama",
				"An ex-con gets on a series of apparently unrelated killings. He gets tracked by a veteran cop with secrets of his own and an egocentric hit man.",
				"\\assets\\pictures\\faster.jpg",
				"https://www.youtube.com/embed/wqnN_O10BBU"
				);
		movieRepository.save(movie);

		movie = new Movie(null, "Tim Burton's Corpse Bride" , "Johnny Depp,Helena Bonham Carter", 6.5F,
				"Comedy,Drama,Horror,Romance,Mystery",
				"Returning to the painstaking stop-motion animation he employed with amazing success in The Nightmare Before Christmas.",
				"\\assets\\pictures\\7.jpg",
				"https://www.youtube.com/embed/j4p9WKnDQzQ"
				);
		movieRepository.save(movie);

		//2.sira

		movie = new Movie(null, "Like Mike 2", "Jascha Washington", 4.1F,
				"Comedy,Drama,Family",
				"Another young boy with 'hoop dreams' finds an old pair of Michael Jordan's sneakers and can suddenly play ball like the greatest player in the world.",
				"\\assets\\pictures\\1.jpg",
				"https://www.youtube.com/embed/C6err100S78"
		);
		movieRepository.save(movie);

		movie = new Movie(null, "Guardians Of The Galaxy", "Chris Pratt", 8.0F,
				"Action,Adventure,Comedy",
				"A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.",
				"\\assets\\pictures\\Gog.jpg",
				"https://www.youtube.com/embed/BEPbXYzE5_Y"
		);
		movieRepository.save(movie);

		movie = new Movie(null, "Guardians Of The Galaxy 2", "Chris Pratt,Zoe Saldana", 7.6F,
				"Action,Adventure,Comedy",
				"The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.",
				"\\assets\\pictures\\gog2.jpg",
				"https://www.youtube.com/embed/63HVKrJ5cNk" );
		movieRepository.save(movie);

		movie = new Movie(null, "Avengers", "Robert Downey Jr.,Chris Evans", 8.0F,
				"Action,Adventure,Sci -Fi",
				"Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
				"\\assets\\pictures\\av.jpg",
				"https://www.youtube.com/embed/SLD9xzJ4oeU"
		);
		movieRepository.save(movie);

		movie = new Movie(null, "Avengers Age of Ultron", "Robert Downey Jr.,Chris Evans", 8.0F,
				"Action,Adventure,Sci -Fi",
				"When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan.",
				"\\assets\\pictures\\av2.jpg",
				"https://www.youtube.com/embed/lPpfK1K1qNU"
		);
		movieRepository.save(movie);




		movie = new Movie(null, "Lord Of The Rings Fellowship Of The Ring",
				"Elijah Wood,Viggo Mortensen,Ian McKellen", 8.8F,
				"Action,Adventure,Drama",
				"A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
				"\\assets\\pictures\\lotr.jpg",
				"https://www.youtube.com/embed/N4xV2RIlMi4"
		);
		movieRepository.save(movie);

		movie = new Movie(null, "Lord Of The Rings The Two Towers",
				"Elijah Wood,Viggo Mortensen,Ian McKellen", 8.8F,
				"Action,Adventure,Drama",
				"While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.",
				"\\assets\\pictures\\lotr2.jpg",
				"https://www.youtube.com/embed/78IJdhvY1zg");

		movieRepository.save(movie);

		movie = new Movie(null, "Lord Of The Rings Return Of The King",
				"Elijah Wood,Viggo Mortensen,Ian McKellen", 9.0F,
				"Action,Adventure,Drama",
				"Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
				"\\assets\\pictures\\lotr3.jpg",
				"https://www.youtube.com/embed/w86sDrAtq-0");
		movieRepository.save(movie);


		/********************************************/

		MovieWithRating movie2 = new MovieWithRating(null, "Like Mike 2", "Jascha Washington", 9.9F,3,
				"Comedy,Drama,Family",
				"  Die-hard hoops fan Jerome Jenkins Junior gets no respect at the local court, ",
				"\\assets\\pictures\\1.jpg",
				"\"https://www.youtube.com/embed/gfZWzD7COwo?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx\""
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Tyler Perry's Madea Goes to Jail", "Tyler Perry,Derek Luke", 6.5F,3,
				"Comedy,Drama,Thriller",
				"After a high-speed freeway chase puts Madea (TYLER PERRY) in front of the judge, her reprieve is short-lived as anger management issues get the best of her and land her in jail.",
				"\\assets\\pictures\\2.jpg",
				"https://www.youtube.com/embed/1cNBV3LG5n0"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Little Nicky", "Adam Sandler,Patricia Arquette", 6.5F,4,
				"Comedy,Romance",
				"When Satan reneges on his plans to retire, two of his three heirs leave Hell for New York City to gather enough souls to vote the Prince of Darkness out of office.",
				"\\assets\\pictures\\3.jpg",
				"https://www.youtube.com/embed/Z23JeEtzTUM?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx" );
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "13 Hours: The Secret Soldiers of Benghazi", "James Badge Dale,Max Martini", 6.5F,3,
				"Drama",
				"From director Michael Bay, 13 HOURS: THE SECRET SOLDIERS OF BENGHAZI is the gripping true story of six elite ex-military operators assigned to protect the CIA.",
				"\\assets\\pictures\\4.jpg",
				"https://www.youtube.com/embed/YDZgtl4OsXk?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,4,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie = new Movie(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Tim Burton's Corpse Bride" , "Johnny Depp,Helena Bonham Carter", 6.5F,2,
				"Comedy,Drama,Horror,Romance,Mystery",
				"Returning to the painstaking stop-motion animation he employed with amazing success in The Nightmare Before Christmas.",
				"\\assets\\pictures\\7.jpg",
				"https://www.youtube.com/embed/9l9Se-4QbdY?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		//2.sira

		movie2 = new MovieWithRating(null, "Like Mike 2", "Jascha Washington", 9.9F,4,
				"Comedy,Drama,Family",
				"  Die-hard hoops fan Jerome Jenkins Junior gets no respect at the local court, ",
				"\\assets\\pictures\\1.jpg",
				"\"https://www.youtube.com/embed/gfZWzD7COwo?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx\""
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Tyler Perry's Madea Goes to Jail", "Tyler Perry,Derek Luke", 6.5F,3,
				"Comedy,Drama,Thriller",
				"After a high-speed freeway chase puts Madea (TYLER PERRY) in front of the judge, her reprieve is short-lived as anger management issues get the best of her and land her in jail.",
				"\\assets\\pictures\\2.jpg",
				"https://www.youtube.com/embed/1cNBV3LG5n0"
		);
		movieWithRatingRepository.save(movie2);

		movie = new Movie(null, "Little Nicky", "Adam Sandler,Patricia Arquette", 6.5F,
				"Comedy,Romance",
				"When Satan reneges on his plans to retire, two of his three heirs leave Hell for New York City to gather enough souls to vote the Prince of Darkness out of office.",
				"\\assets\\pictures\\3.jpg",
				"https://www.youtube.com/embed/Z23JeEtzTUM?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx" );
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "13 Hours: The Secret Soldiers of Benghazi", "James Badge Dale,Max Martini", 6.5F,2,
				"Drama",
				"From director Michael Bay, 13 HOURS: THE SECRET SOLDIERS OF BENGHAZI is the gripping true story of six elite ex-military operators assigned to protect the CIA.",
				"\\assets\\pictures\\4.jpg",
				"https://www.youtube.com/embed/YDZgtl4OsXk?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,3,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Another Cinderella Story" , "Selena Gomez,Andrew Seeley", 6.5F,1,
				"Comedy,Romance,Family",
				"Somewhere deep in the heart of the San Fernando Valley, a modern-day fairy tale romance is about to come true again",
				"\\assets\\pictures\\5.jpg",
				"https://www.youtube.com/embed/7MwgfkhcG7Q?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);

		movie2 = new MovieWithRating(null, "Tim Burton's Corpse Bride" , "Johnny Depp,Helena Bonham Carter", 6.5F,2,
				"Comedy,Drama,Horror,Romance,Mystery",
				"Returning to the painstaking stop-motion animation he employed with amazing success in The Nightmare Before Christmas.",
				"\\assets\\pictures\\7.jpg",
				"https://www.youtube.com/embed/9l9Se-4QbdY?list=PLHPTxTxtC0ibVZrT2_WKWUl2SAxsKuKwx"
		);
		movieWithRatingRepository.save(movie2);


		User user = new User(null, "admin", "12345", "Gabriel M");
		userRepository.save(user);

	}
}
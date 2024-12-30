package com.mastery.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {
	public static List<Movie> getMovieList() {
		
		List<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie("Guardians of the Galaxy", "Sci-Fi", "2014", 121, 8.1, 757074, 333.13,
				Arrays.asList("Chris Pratt", "Vin Diesel", "Bradley Cooper", "Zoe Saldana")));
		movieList.add(new Movie("Prometheus", "Sci-Fi", "2012", 124, 7, 485820, 126.46,
				Arrays.asList("Noomi Rapace", "Logan Marshall-Green", "Michael Fassbender", "Charlize Theron")));
		movieList.add(new Movie("Split", "Horror", "2016", 117, 7.3, 157606, 138.12,
				Arrays.asList("James McAvoy", "Anya Taylor-Joy", "Haley Lu Richardson", "Jessica Sula")));
		movieList.add(new Movie("Frozen", "Animation", "2013", 102, 7.5, 451894, 400.74,
				Arrays.asList("Kristen Bell", "Idina Menzel", "Jonathan Groff", "Josh Gad")));
		movieList.add(new Movie("Passengers", "Adventure", "2016", 116, 7, 192177, 100.01,
				Arrays.asList("Jennifer Lawrence", "Chris Pratt", "Michael Sheen", "Laurence Fishburne")));
		movieList.add(new Movie("Into the Woods", "Drama", "2014", 125, 6, 109756, 128,
				Arrays.asList("Anna Kendrick", "Meryl Streep", "Chris Pine", "Emily Blunt")));
		movieList.add(new Movie("12 Years a Slave", "Drama", "2013", 134, 8.1, 486338, 56.67,
				Arrays.asList("Chiwetel Ejiofor", "Michael Kenneth Williams", "Michael Fassbender", "Brad Pitt")));

		return movieList;
	}
}
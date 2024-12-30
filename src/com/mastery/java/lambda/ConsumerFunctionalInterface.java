package com.mastery.java.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
	
	public static void main(String[] args) {
		
		List<Movie> movieList = MovieList.getMovieList();
		
		Consumer<Movie> consumerMovie = (m)-> {System.out.println(m);};
		movieList.forEach(consumerMovie);
	}

}

package com.mastery.java.lambda;

import java.util.List;


public class Movie {

	String name;
	String genre;
	String year;
	int lengthMinutes;
	double rating;
	int votes;
	double revenue;
	List<String> actors;

	public Movie(String name, String genre, String year, int lengthMinutes, double rating, int votes, double revenue,
			List<String> actors) {
		super();
		this.name = name;
		this.genre = genre;
		this.year = year;
		this.lengthMinutes = lengthMinutes;
		this.rating = rating;
		this.votes = votes;
		this.revenue = revenue;
		this.actors = actors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getLengthMinutes() {
		return lengthMinutes;
	}

	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", year=" + year + ", lengthMinutes=" + lengthMinutes
				+ ", rating=" + rating + ", votes=" + votes + ", revenue=" + revenue + ", actors=" + actors + "]";
	}
	
	

}

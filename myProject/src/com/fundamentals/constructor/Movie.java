package com.fundamentals.constructor;

public class Movie {
	String hero;
	String heroine;
	String director;
	String producer;
	String Moviename;
	double budget;

	Movie() {
		System.out.println("movie no arg constructor  called");

	}

	public Movie(String director, String producer) {

		this.director = director;
		this.producer = producer;
	}

	public Movie(Movie m1, String hero, String heroine) {

		this.hero = hero;
		this.heroine = heroine;
		this.director = m1.director;
		this.producer = m1.producer;
	}

	public Movie(Movie m2, String moviename, double budget) {
		super();
		this.hero = m2.hero;
		this.heroine = m2.heroine;
		this.director = m2.director;
		this.producer = m2.producer;
		Moviename = moviename;
		this.budget = budget;
	}

	public static void main(String[] args) {
		Movie m = new Movie();
		m.ShowDetails();
		Movie m1 = new Movie("manohar", "Sriram");
		m1.ShowDetails();

		Movie m2 = new Movie(m1, "Mahendra", "mahaa");
		m2.ShowDetails();
		Movie m3 = new Movie(m2, "bhahubali", 2832773.00);
		m3.ShowDetails();

	}

	void ShowDetails() {
		System.out.println("*************************************");
		System.out.println("name of the Movie : " + Moviename);
		System.out.println("name of the Hero : " + hero);
		System.out.println("name of the Heroine : " + heroine);
		System.out.println("name of the producer : " + producer);
		System.out.println("name of the director : " + director);
		System.out.println("Budget of the movie " + budget);
		System.out.println("*************************************");

	}
}

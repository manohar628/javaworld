package com.fundamentals.constructor;

class grandparent {
	String movie ;
	int budget;

	void display() {
		System.out.println("grand parent method called");
	}

	public grandparent(String movie, int budget) {
		super();
		this.movie = movie;
		this.budget = budget;
	}

}

class parent extends grandparent {
	String producer;
	String director;

	void display() {
		System.out.println("parent method called and overrided");
		System.out.println("movie name " + super.movie);
		super.display();

	}

	public parent(String movie, int budget, String producer, String director) {
		super(movie, budget);
		this.producer = producer;
		this.director = director;
	}

}

class child extends parent {
	int collecton;

	void display() {
		System.out.println("child method called ");
		System.out.println("movie name " + super.movie);
		super.display();
	}

	public child(String movie, int budget, String producer, String director, int collecton) {
		super(movie, budget, producer, director);
		this.collecton = collecton;

	}

}

public class lab2 {

	public static void main(String[] args) {
		child c = new child("bali", 47834784, "manohar", "mahendra", 47846366);
		c.display();

	}

}

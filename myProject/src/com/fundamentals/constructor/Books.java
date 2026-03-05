package com.fundamentals.constructor;

public class Books {
	String Bookname;
	String Authornane;
	double price;
	int Releasedon;

	Books(String Bookname, String Authorname, double price, int Releasedon) {
		System.out.println("four constructor called ");
		System.out.println("book name : " + Bookname);
		System.out.println("Author name : " + Authorname);
		System.out.println("price of book : " + price);
		System.out.println("Book released on : " + Releasedon);

	}

	Books(String Bookname, String Authorname, double price) {
		this(Bookname, Authorname, price, 2026);
		System.out.println("three arg constructor called");

	}

	Books(String Bookname, String Authorname) {
		this(Bookname, Authorname, 2999934.33);
		System.out.println("two arg constructor called");
	}

	Books(String Bookname) {
		this(Bookname, "manohar");
		System.out.println("one arg constructor called");

	}

	Books() {
		this("money matters");
		System.out.println("no arg constructor called: ");

	}

	public static void main(String[] args) {
		System.out.println("main method Started ");
		Books b = new Books();

	}

}

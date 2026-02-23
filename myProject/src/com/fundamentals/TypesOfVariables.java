package com.fundamentals;

public class TypesOfVariables {

//	primitive+instance variable
	int Id;
//	object+instance variable
	String name;

//	primitive +static variable
	static int CollegeId = 500100;
//	object+static variable
	static String collegename = "SMEC";

	public static void main(String[] args) {

		System.out.println("main method started");
//		object creation for access insatnce variable
		TypesOfVariables t = new TypesOfVariables();
		System.out.println(t.Id);
		System.out.println(t.name);

//		to accessing static data directly
		System.out.println(CollegeId);
		System.out.println(collegename);

		System.out.println(TypesOfVariables.CollegeId);
		System.out.println(TypesOfVariables.collegename);

		System.out.println(t.CollegeId);
		System.out.println(t.collegename);

	}

}

package com.fundamentalmethods;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		System.out.println("Student detials");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Student ID : ");
		int id = sc.nextInt();
		System.out.println("Student ID  : " + sID(id));
		System.out.println("enter first name of student  :");
		String fn = sc.next();
		System.out.println(" enter last name of student  :");
		String ln = sc.next();
		System.out.println("Full Nme of Student :" + sName(fn, ln));
		System.out.println("Enter Gendern of Student : ");
		char g = sc.next().charAt(0);
		System.out.println(" Student gender : " + gender(g));
		sc.close();

	}

	static int sID(int a) {
		int id = a;
		return id;
	}

	static String sName(String firstname, String lastname) {

		String Fulln = firstname + " " + lastname;
		return Fulln;
	}

	static char gender(char a) {
		char ge = a;
		return ge;

	}

}

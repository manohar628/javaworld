package com.basics.logicalst;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year check whether it is leap year or not");
		int year = sc.nextInt();
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("it is a leap year");
		} else {
			System.out.println("it is a not a leap year");
		}
	}

}

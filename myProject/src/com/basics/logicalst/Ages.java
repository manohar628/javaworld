package com.basics.logicalst;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your age :");
		int age = sc.nextInt();
		if (age > 0 && age <= 5) {
			System.out.println("your are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("your are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("your are a teen");
		} else if (age >= 20 && age <= 35) {
			System.out.println("your a young ");
		} else if (age >= 36 && age <= 60) {
			System.out.println(" your a middle age");
		} else {
			System.out.println("your a senior citizen");
		}
	}

}

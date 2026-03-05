package com.tests;

import java.util.Scanner;

public class Oddeven {
	static void evenodd(int a) {

		if (a % 2 == 0) {
			System.out.println("it is even ");
		} else {
			System.out.println("it is odd");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a value to check odd or even :");
		int a = sc.nextInt();

		evenodd(a);
		sc.close();
	}

}

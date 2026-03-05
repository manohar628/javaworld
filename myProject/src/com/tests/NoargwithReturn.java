package com.tests;

import java.util.Scanner;

public class NoargwithReturn {

	public static int Square() {
		System.out.println("enter a value to square it : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int square = a * a;

		return square;

	}

	public static void main(String[] args) {
		System.out.println("Main method started : ");
		System.out.println("Square of your number : " + Square());

	}

}

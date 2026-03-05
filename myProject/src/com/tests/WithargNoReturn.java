package com.tests;

import java.util.Scanner;

public class WithargNoReturn {
	void Sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two Numbers :" + sum);

	}

	void multiply(int a, int b) {
		int mul = a * b;
		System.out.println("multiply of two Numbers :" + mul);

	}

	public static void main(String[] args) {
		System.out.println("main method Started");

		WithargNoReturn w = new WithargNoReturn();
		w.Sum(65, 70);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		w.multiply(a, b);
		sc.close();

	}

}

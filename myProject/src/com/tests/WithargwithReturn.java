package com.tests;

import java.util.Scanner;

public class WithargwithReturn {
	static int largeNum(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	int largestnum(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method Started");
		WithargwithReturn w = new WithargwithReturn();

		largeNum(15, 79);
		System.out.println("your largest number : " + largeNum(15, 79));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values to get large Number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		w.largestnum(a, b);
		System.out.println("Large NUmber " + w.largestnum(a, b));
		sc.close();

	}

}

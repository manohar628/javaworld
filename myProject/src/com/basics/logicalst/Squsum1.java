package com.basics.logicalst;

import java.util.Scanner;

public class Squsum1 {

	static int FindMag(int i) {

		int r = 0;
		int sum = 0;
		while (i != 0) {
			r = i % 10;
			i = i / 10;
			r=r*r;

			sum = sum + r;

		}
		System.out.println(sum);
		if (sum == 1) {
			return sum;
		} else if (sum < 10 && sum > 2) {
			return sum;
		} else {
			return FindMag(sum);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int i = FindMag(n);
		if (i == 1) {
			System.out.println("Enter number is magic num");
		} else {
			System.out.println("enter number is not magic");

		}

	}

}

package com.basics.logicalst;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int n = sc.nextInt();
		boolean status = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println("it is a prime number");
		} else {
			System.out.println(" not  a prime number ");
		}
	}

}

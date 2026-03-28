package com.basics.logicalst;

import java.util.Scanner;

public class NumbertypeChecher {

	public static void main(String[] args) {
		System.out.println(" enter a number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Positive Even");
			} else {
				System.out.println("Positive Odd");
			}
		} else if (num < 0) {
			if (num % 2 == 0) {
				System.out.println("Negative Even");
			} else {
				System.out.println("Negative Odd");
			}
		} else {
			System.out.println("Zero");
		}
	}

}

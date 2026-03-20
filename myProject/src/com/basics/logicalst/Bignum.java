package com.basics.logicalst;

import java.util.Scanner;

public class Bignum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number  :");
		int A = sc.nextInt();
		System.out.println(" Enter B number :");
		int B = sc.nextInt();
		if (A > B) {
			System.out.println("A is Big  number " + A);
		} else {
			System.out.println("B is Big Number : " + B);
		}
		sc.close();

	}

}

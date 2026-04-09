package com.basics.logicalst;

import java.util.Scanner;

public class StrongNum {
	static int FindFact(int r) {

		int fact = 1;
		for (int i = r; i >= 1; i--) {

			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a number");
		int n = sc.nextInt();
		int r = 0;
		int temp = n;

		int sum = 0;

		while (n != 0) {
			r = n % 10;
			int fact = 1;
			for (int i = r; i >= 1; i--) {

				fact *= i;
			
			}
			sum+=fact;
			n = n / 10;

		}
		System.out.println(" Factorial of your given number  " + sum);
		if (sum == temp) {
			System.out.println("Given Number is Strong ");
		} else {
			System.out.println("GGiven Number not Strong ");
		}
		sc.close();
	}

}

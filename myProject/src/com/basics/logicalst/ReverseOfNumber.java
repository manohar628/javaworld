package com.basics.logicalst;

import java.util.Scanner;

public class ReverseOfNumber {
//Reverse of a given  number 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		int rev = 0;
		
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		System.out.println("reverse of a given number " + rev);

	}

}

package com.basics.logicalst;

import java.util.Scanner;

public class FactoriallOfGivenN {
//factorial of a given number 
//4!=4*3*2*1=24
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a number");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		
		System.out.println(" Factorial of your given number  " + fact);
	sc.close();
	}
	

}

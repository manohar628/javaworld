package com.basics.logicalst;

import java.util.Scanner;

public class FactorialByRecursion {
// recursion mean a number calling itself and return a its fact
	
	static int findfactorial(int n) {
//	int fact=1;
		if(n==1) {
			return 1;
	}
	return n*findfactorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		int n=sc.nextInt();
		int ft=findfactorial(n);
		System.out.println("Factorial of a given number :"+ft);

	}

}

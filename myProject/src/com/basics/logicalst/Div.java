package com.basics.logicalst;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	for (int i=1;i<=n;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println("fizz buzz");
			
		}else if(i%3==0) {
			System.out.println("buzz");
			
		}else if( i%5==0) {
			System.out.println("fizz ");
		}else {
			System.out.println(i);
		}
	}
	}

}

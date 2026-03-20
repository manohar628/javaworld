package com.basics.logicalst;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num =sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println(" the number is even : "+num);
		}
		else {
			System.out.println("the number is odd");
		}
	}

}

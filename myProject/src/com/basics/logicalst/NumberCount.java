package com.basics.logicalst;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter  a Number :");
		int n=sc.nextInt();
		int r=0;
		int count=0;
		while(n!=0) {
			r=n%10;
			System.out.print(r+" ");
			count++;
			n=n/10;
		}
		System.out.println("count of give number "+count);
	}

}

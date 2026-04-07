package com.basics.logicalst;

import java.util.Scanner;

public class ConvertNumToBina {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number :");
		int n=sc.nextInt();
		int r=0;
		String rev=" ";
		while (n!=0) {
			r=n%2;
			n=n/2;
			rev=r+rev;
			
		}System.out.println(" Binary code of a given Number :"+rev);
	

	}

}

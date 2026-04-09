package com.basics.arrays;

import java.util.Scanner;

public class StringsArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		String[] names=new String[size];
		System.out.println("Enter the values to array");
		for(int i=0;i<size;i++) {
			names[i]=sc.next();
		}
	for(String n:names)	{
		if(n.toLowerCase().startsWith("s") || n.endsWith("a")) {
			System.out.println(n+" ");
		}
		
	}
		
	}

}

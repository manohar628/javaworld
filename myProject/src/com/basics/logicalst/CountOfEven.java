package com.basics.logicalst;

import java.util.Scanner;

public class CountOfEven {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number ");
		int n=sc.nextInt();
		int count =0;
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
				count++;
				
			}
		}System.out.println(count);
		
		
	}

}

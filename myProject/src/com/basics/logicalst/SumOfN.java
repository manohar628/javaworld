package com.basics.logicalst;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=0;i<=n;) {
			sum+=i;
			i++;
			
		}System.out.println("sum is "+sum);
	}

}

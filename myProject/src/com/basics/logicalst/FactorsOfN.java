package com.basics.logicalst;

import java.util.Scanner;

public class FactorsOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				
				sum+=i;
				System.out.print(i+"  ");
			}
			
		}System.out.println(n);
		
		if(sum==n) {
			System.out.println("Sum is equal so it is a perfect number");
		}else {
			System.out.println("Sum is not equal so it is not a perfect number");
		}
	}

}

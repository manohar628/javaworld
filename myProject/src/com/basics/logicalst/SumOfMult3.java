package com.basics.logicalst;

import java.util.Scanner;

public class SumOfMult3 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			int sum=0;
			for (int i=1;i<=n;i++) {
				if(i%3==0) {
					System.out.println(i);
					sum+=i;
				}
			}System.out.println(sum);
			

	}

}

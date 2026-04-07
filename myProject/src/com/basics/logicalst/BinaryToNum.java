package com.basics.logicalst;

import java.util.Scanner;

public class BinaryToNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number :");
		int n=sc.nextInt();
		int r=0;
		int result=0;
		int power=0;
		while(n!=0) {
			r=n%10;
			result =result +r*(int)Math.powExact(2,power);
			power++;
			n=n/10;
			
			
		}System.out.println(" Binary code of a given Number :"+result);


	}

}

package com.basics.logicalst;

import java.util.Scanner;

public class ElectricBillwarning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit you get in the bill");
		int units=sc.nextInt();
		if(units<=300) {
			System.out.println("less usage");
		}else if(units>300 && units<500) {
			System.out.println("very high usage Warning");
		}else if(units>=500) {
			System.out.println("very high usage penalty");
		}

	}

}

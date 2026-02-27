package com.fundamentalmethods;
import java.util.Scanner;

public class Areas2 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println(" enter a side of square");
		int side=sc.nextInt();
		Areas2 a=new Areas2();
		
		
		System.out.println("Area of square :"+a.areaOfSquare(side));
		sc.close();


	}
	int areaOfSquare(int s) {
		int Area=s*s;
		return Area;
		
	}

}

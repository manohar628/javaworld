package com.fundamentalmethods;
import java.util.Scanner;

public class Areas1 {

	public static void main(String[] args) {
		System.out.println(" main method started");
		
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter length of rectangle :");
		double length=sc.nextDouble();
		System.out.println(" Enter breath of rectangle : ");
		double breath=sc.nextDouble();
		
		System.out.println("Area of Rectangle : "+areaOfRectangle(length,breath));
		sc.close();
		

	}
	static double areaOfRectangle(double l,double b){
		double rec=l*b;
		return rec;
	}

}

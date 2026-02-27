package com.fundamentalmethods;

import java.util.Scanner;

public class Area3 {

	public static void main(String[] args) {
		System.out.println(" main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter length of triangle :");
		double length = sc.nextDouble();
		System.out.println(" Enter height of triangler  : ");
		double height = sc.nextDouble();

		System.out.println("Area of Rectangle : " + areaOfTri(length, height));
		sc.close();

	}

	static double areaOfTri(double l, double b) {
		double tri = 0.5 * l * b;
		return tri;
	}

}

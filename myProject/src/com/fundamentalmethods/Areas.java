package com.fundamentalmethods;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		System.out.println(" main method startedd");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circle :");
		double r = sc.nextInt();
		double cir=AreaOfCircle(r);
		System.out.println(" area of circle: " + cir);
		sc.close();

	}

	static double AreaOfCircle(double r) {
		double Circle = Math.PI * (r * r);
		return Circle;

	}

}

package com.basics.logicalst;

import java.util.Scanner;

public class NestedIfElse1 {

	public static void main(String[] args) {
		System.out.println(" Welcome to Matrimonial Website");
		Scanner sc = new Scanner(System.in);
		System.out.println("what  is your name ");
		String name = sc.nextLine();
		System.out.println("ok Mrs." + name);

		System.out.println("how many Assets you have ?");
		double assets = sc.nextDouble();
		System.out.println("what about your salary info?");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 && assets >= 2000000.00) {
			System.out.println("ok lets go futher..");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age <= 28 && age >= 26) {
				System.out.println("Oh Okay !! Shall we proceed furthur !");
				System.out.println("what about your weght");
				float weight = sc.nextFloat();
				if (weight <= 80.0 && weight >= 55.0) {
					System.out.println("thats cool");

					System.out.println("what is ypur heigth");
					float height = sc.nextFloat();
					if (height >= 5.0 && height <= 6.0) {
						System.out.println("thats alright");
						System.out.println("do you have sliblings");
						boolean sib = sc.nextBoolean();
						if (!sib) {
							System.out.println(" okay we will get back to you soon");

						} else {
							System.out.println(" we are not okay your rejected");
						}

					} else {
						System.out.println("its not okay ");
					}

				} else {
					System.out.println("it effect in future in hospitals");
				}

			} else {
				System.out.println("we expect more soooo");
			}

		} else {
			System.out.println("sorry the assumption was not reached");
		}
	}

}

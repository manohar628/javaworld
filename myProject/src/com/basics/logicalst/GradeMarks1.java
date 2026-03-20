package com.basics.logicalst;

import java.util.Scanner;

public class GradeMarks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		double marks = sc.nextDouble();
		sc.close();
		if (marks > 100 || marks < 0) {
			System.out.println("invalid marks percentage");
		} else if (marks >= 90) {
			System.out.println("Grade A");

		} else if (marks >= 80) {
			System.out.println("grade B");
		} else if (marks >= 70) {
			System.out.println("grade c");
		} else if (marks >= 60) {
			System.out.println(" grade D");
		} else if (marks > 35) {
			System.out.println("just passed");
		} else {
			System.out.println("failed");
		}

	}

}

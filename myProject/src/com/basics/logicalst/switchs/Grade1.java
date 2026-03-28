package com.basics.logicalst.switchs;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		System.out.println("Your in Grade Description System");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your grade");
		char Grade = sc.next().charAt(0);
		switch (Grade) {
		case 'A' -> System.out.println("excellent");
		case 'B' -> System.out.println("Very good");
		case 'C' -> System.out.println("good");
		case 'D' -> System.out.println("avg");
		case 'E' -> System.out.println("poor");
		default -> System.out.println("fail");
		}
	}

}

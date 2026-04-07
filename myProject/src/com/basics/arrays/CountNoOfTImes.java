package com.basics.arrays;

import java.util.Scanner;

public class CountNoOfTImes {

	public static void main(String[] args) {
		int[] arr = { 45, 55, 89, 11, 44, 10, 100, 44, 44 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number Count it :");
		int key = sc.nextInt();
		int count1 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count1++;
			}
		}
		System.out.println(key + " occured " + count1 + " Times ");
	}
}

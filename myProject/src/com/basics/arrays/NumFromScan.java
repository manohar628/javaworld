package com.basics.arrays;

import java.util.Scanner;

public class NumFromScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array : ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println(" Enter values to array : ");
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

}

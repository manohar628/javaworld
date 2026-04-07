package com.basics.arrays;

public class OddArr {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				System.out.println("Odd number from array : " + arr[i]);
			}
		}

	}

}

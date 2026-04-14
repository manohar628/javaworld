package com.basics.arrays;

public class SameNumArr {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 10, 40, 20 };
		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr.length; j++) {
				if (i!=j&&arr[i] == arr[j]) {
					System.out.println("duplicate values : " + arr[i]);
					
					found = true;
					break;

				}

			}
			if (found) {
				System.out.println("duplicate values : " + arr[i]);

			}

		}

	}

}

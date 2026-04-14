package com.basics.arrays;

public class NumsameArr {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 40, 20 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					System.out.println("duplicate values : " + arr[i]);

				}
			}
		}
	}

}

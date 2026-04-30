package com.basics.arrays;

public class Array {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					if (j <= arr.length / 2) {
						temp = arr[i][j];
						arr[i][j] = arr[i][arr.length - 1 - j];
						arr[i][arr.length - 1 - j] = temp;

					}
					if (i == j) {
						arr[i][j] = arr[i][j] * arr[i][j];
					}
				}
			} else {
				for (int j = 0; j < arr.length; j++) {
					if (i == j) {
						arr[i][j] = arr[i][j] * arr[i][j];
					} else {
						arr[i][j] = arr[i][j] * 2;
					}
				}
			}

		}

		for (int[] arr1 : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
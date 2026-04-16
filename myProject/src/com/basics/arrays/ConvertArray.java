package com.basics.arrays;

public class ConvertArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr1 = new int[3][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length + 1; j++) {
				arr1[j][i] = arr[i][j];

			}
		}
		for (int[] c : arr1) {
			for (int d : c) {
				System.out.print(d + " ");
			}
			System.out.println();

		}
	}
}
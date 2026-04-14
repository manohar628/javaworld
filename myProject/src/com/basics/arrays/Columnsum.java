package com.basics.arrays;

public class Columnsum {
	public static void main(String[] args) {

		int[][] num = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int j = 0; j < num[0].length; j++) {
			int sum = 0; // reset for each row

			for (int i = 0; i < num.length; i++) {

				sum += num[i][j];

			}

			System.out.println("Sum of row " + j + " = " + sum);
		}

//	        for (int[] row : num) {
//	            int sum = 0;
//
//	            for (int val : row) {
//	                sum += val;
//	            }
//
//	            System.out.println("Row sum = " + sum);
		////		        }
		for (int[] n : num) {
			for (int a : n) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}
}

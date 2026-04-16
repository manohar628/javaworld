package com.basics.arrays;

public class Diagonalsum {

	public static void main(String[] args) {
		int sum = 0;
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {

				if (i == j) {
					sum += num[i][j];
				}
			}

		}

		System.out.println("Sum of Diagonals : " + sum);
		int sum1 = 0;
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num.length;j++) {
				if (i + j == num.length - 1) {
					sum1 += num[i][j];

				}
			}
			
		}
		System.out.println("Sum of Diagonals : " + sum1);

	}
}

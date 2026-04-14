package com.basics.arrays;

public class RowSum {

	public static void main(String[] args) {

		int[][] num = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < num.length; i++) {
			int sum = 0; // reset for each row

			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}

			System.out.println("Sum of row " + i + " = " + sum);
		}
		
//		        for (int[] row : num) {
//		            int sum = 0;
//
//		            for (int val : row) {
//		                sum += val;
//		            }
//
//		            System.out.println("Row sum = " + sum);
		////		        }
		for(int [] n:num) {
			for(int a:n) {
				System.out.print(a+" ");
			}
			System.out.println( );
		}
	}

}

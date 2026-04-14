package com.basics.arrays;

public class Diagonalsum {

	public static void main(String[] args) {
int sum=0;
		int[][] num = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < num[i].length; j++) {
			
				if(i==j) {
					sum+=num[i][j];
				}
			}

		}
		System.out.println("Sum of Diagonals : "+sum);
		
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

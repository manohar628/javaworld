package com.basics.arrays;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size for the rows: ");
		int size1 = sc.nextInt();
		System.out.println(" etner size  for columns : ");
		int size2 = sc.nextInt();
		int sum = 0;
		
		int[][] nums = new int[size1][size2];
		System.out.println(" Enter values to array : ");
		for (int i = 0; i < nums.length; i++) {
			int sum1=0;
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			
				sum += nums[i][j];
				sum1+=nums[i][j];

			}
			System.out.println("Sum of each row "+ i +" = "+ sum1);
			
		}
		for (int[] n : nums) {
			for (int num : n) {
				System.out.print(num + " ");

			}
			System.out.println();

		}

		System.out.println("sum of an array : " + sum);

	}

}

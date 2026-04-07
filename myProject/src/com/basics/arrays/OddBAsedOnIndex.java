package com.basics.arrays;

public class OddBAsedOnIndex {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		int sum=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {

			if (i% 2 !=0 ) {
				sum+=arr[i];
				System.out.println("Odd number from array : " + arr[i]);
				count++;
			}
		}
		System.out.println("Sum of all odd Number "+sum);
		System.out.println(" Number of odd Numbers  "+count);
	}

	}



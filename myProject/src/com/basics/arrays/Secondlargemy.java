package com.basics.arrays;

public class Secondlargemy {
	public static int findSecondLargest(int[] arr) {
		int min=0;
		int max=0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > min) {
				max = min;
				min = arr[i];
			} else if (arr[i] >max && arr[i] != min) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 45, 23, 101, 89, 111, 44, 106, 1 };

		int result = findSecondLargest(arr);
		System.out.println("Second  large Number = " + result);
	}

}

package com.basics.arrays;

public class SecondSmallNum {

	public static int findSecondLargest(int[] arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}

		return second;
	}

	public static void main(String[] args) {
		int[] arr = { 45, 23, 101, 89, 111, 44, 106, 1 };

		int result = findSecondLargest(arr);
		System.out.println("Second  Smallest Number = " + result);
	}
}

package com.basics.arrays;

public class Secondlargemy {
	public static int findSecondLargest(int[] arr) {
//		int max1=0;
//		int max2=0;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] > max1) {
//				max2 = max1;
//				max1 = arr[i];
//			} else if (arr[i] >max2 && arr[i] != max1) {
//				max2 = arr[i];
//			}
//		}
//
//		return max2;
		
//	}
		int max1=0;
		int max2=0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max1) {
		
				max1 = arr[i];
			} else if (arr[i] >max2 && arr[i] != max1) {
				max2 = arr[i];
			}
		}

		return max2;
	}


	public static void main(String[] args) {
		int[] arr = { 45, 23, 101, 89, 111, 44, 106, 1 };

		int result = findSecondLargest(arr);
		System.out.println("Second  large Number = " + result);
	}

}

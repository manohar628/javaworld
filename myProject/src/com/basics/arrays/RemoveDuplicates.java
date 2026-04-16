package com.basics.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 3, 2, 1, 4 };
		for (int i = 0; i < num.length; i++) {
			boolean found = true;
			for (int j = 0; j < i; j++) {

				if (num[i] == num[j]) {
					found = false;
					break;

				}
			}
			if (found) {
				System.out.print(num[i] + " ");
			}
		}

	}

}

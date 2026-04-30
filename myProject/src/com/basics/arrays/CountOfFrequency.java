package com.basics.arrays;

public class CountOfFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			boolean found = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;

					break;

				}
			}

			if (found) {
				continue;
			}
				int count = 1;

				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}

				}
				System.out.println("count " + arr[i] + " = " + count);

			}
		}

	}



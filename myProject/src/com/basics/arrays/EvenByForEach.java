package com.basics.arrays;

public class EvenByForEach {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		int sum = 0;
		int count = 0;
		for (int n : arr) {
			if (n % 2 == 0) {
				sum += n;
				System.out.println("even number from array " + n);
				count++;
			}

		}
		System.out.println(" Sum of even Numbers : " + sum);
		System.out.println(" Number of Even Number " + count);

	}
}

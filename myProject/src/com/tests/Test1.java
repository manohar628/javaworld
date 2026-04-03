package com.tests;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int sum1 = 0;
		int count1 = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				sum += i;
				count++;

			}else {
				sum1+=i;
				count1++;
			}

		}
		System.out.println("sum of it " + sum);
		System.out.println("count of it " + count);
		System.out.println("sum of it " + sum1);
		System.out.println("count of it " + count1);

	}

}

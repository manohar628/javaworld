package com.basics.arrays;

public class SummOfArr {

	public static void main(String[] args) {
		int [] arr= {45,55,89,65,44,75,100};
		System.out.println(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}

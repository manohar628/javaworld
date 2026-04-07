package com.basics.arrays;

public class AvgOfArray {

	public static void main(String[] args) {
		
		int[] arr = { 45, 55, 89, 11, 44, 10, 100 };
		
		System.out.println(arr);
		int avg = 0;
		int sum = 0;
		int count=0;
		int min=arr[0];
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;
				if (arr[i]>max) {
					
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				
				}
		}
		System.out.println("Sum of Array List : " + sum);
		avg = sum / arr.length;
		System.out.println("Average of arraylist :" + avg);
		System.out.println("length of an array : "+count);
		System.out.println("Length of array : "+arr.length);
		System.out.println("maximum value of the array : "+max);
		System.out.println("minimum value of the array : "+min);
	}

}

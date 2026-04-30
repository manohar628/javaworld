package com.tests;

public class ReverseOfArrayNum {
//	2. Reverse Each Element in the Given Array
//	Write a Java program to reverse each element in the given array.
//	Input:
//
//	int arr[] = {11,12,13,14,15,16};
//	Output:
//
//	{11,21,31,41,51,61}

	public static void main(String[] args) {
		int arr[] = {11,12,13,14,15,16};
		
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
		int rev=0;
		
		while(num>0) {
			
				int r=num%10;
				rev=rev*10+r;
				num=num/10;
				
			}
		arr[i]=rev;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

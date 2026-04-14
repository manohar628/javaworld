package com.basics.arrays;

public class MissingNum {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5};
		int sum=0;
		int n=5;
		int sum1=n*(n+1)/2;
		System.out.println("Length Sum :"+sum1);
		
		for(int i=0;i<n-1;i++) {
			sum+=arr[i];
			System.out.println(arr[i]+" ");
		}
		System.out.println("Sum of the array : "+sum);
		System.out.println("Missing Num : "+(sum1-sum));
	}

}

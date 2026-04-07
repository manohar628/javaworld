package com.basics.arrays;
//Replace a specific element with another value
public class ReplaceArrNum {

	public static void main(String[] args) {
		int[] arr = { 45, 101, 89, 111, 44, 106, 100 };
		int target=111;
		int NewValue=98;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				arr[i]=NewValue;
			}
			System.out.println(arr[i]);
		}
		

	}

}

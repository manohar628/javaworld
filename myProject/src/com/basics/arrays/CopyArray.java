package com.basics.arrays;
//Copy one array into another
public class CopyArray {

	public static void main(String[] args) {
		int[] arr = { 45,23 ,101, 89, 111, 44, 106, 1 };
		int []arr1= new int[9];
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
				arr1[i]=arr[i];
				System.out.print(arr1[i]+" ");
			
		
		}
		


	}

}

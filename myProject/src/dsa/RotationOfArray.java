package dsa;

import java.util.Scanner;

public class RotationOfArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number of rotations ");
		int r=sc.nextInt();
		findReverse(arr,r);
		for(int a:arr) {
		System.out.print(a+" ");
		}

	}
		public static void findReverse(int[] arr, int r) {
		
		int start=0;
		int end=arr.length-1;
		FindRotation(arr,start,end);
		FindRotation(arr,start,r-1);
		FindRotation(arr,r,end);
		
		
	}
		public static void FindRotation(int[] arr, int start, int end) {
			 int temp=0;
			 while(start<end) {
				 temp=arr[start];
				 arr[start]=arr[end];
				 arr[end]=temp;
				 
				 start++;
				 end--;
			 }
			
		}

}

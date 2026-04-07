package com.basics.arrays;

import java.util.Scanner;

public class SearchOfNum {
	
	

	public static void main(String[] args) {
		
		int[] arr = { 45, 101, 89, 111, 44, 106, 100 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int Search = sc.nextInt();
		boolean found=false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==Search) {
				System.out.println(" element found index : "+i);
				found =true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element not Found");
		}
			
		}
		
	}



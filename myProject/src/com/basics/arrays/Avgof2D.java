package com.basics.arrays;

import java.util.Scanner;

public class Avgof2D {

	public static void main(String[] args) {
		int[][] num= {{10,20,30},{40,50,60},{70,80,90}};
			int sum=0;
			int avg=0;
			int count=0;
			for(int i=0;i<num.length;i++) {
				for(int j=0;j<num[i].length;j++) {
					sum+=num[i][j];
					count++;
					
				}
			}
		
		avg=sum/count;
		System.out.println("sum of an array : "+sum);
		System.out.println("Avg of 2d : "+avg);

	}


	}



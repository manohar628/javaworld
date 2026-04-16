package com.basics.arrays;

public class Sums2d {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++) {
			int rsum=0;
			int csum=0;
			for(int j=0;j<matrix.length;j++) {
			 
				rsum+=matrix[i][j];
				csum+=matrix[j][i];
			 
				
			}
			
			System.out.println("Sum row : "+rsum);
			System.out.println("Sum column : "+csum);
		}
	
				
		
		
	}

}

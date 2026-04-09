package com.basics.arrays;

public class TwoDArr {

	public static void main(String[] args) {
		int [][] matrix=new int[3][3];
		System.out.println(matrix.length);// 0 1 2
		System.out.println(matrix[0].length);//0 1 2
		
		
	for(int i=0;i<matrix.length;i++) {
		for(int j=0 ; j<matrix[i].length;j++) {
			System.out.print(matrix[i][j]+ " ");
		}
		System.out.println( );
	}
	}

}

package com.basics.arrays;

public class MinMaxOf2D {

	public static void main(String[] args) {
	
			int[][] num= {{50,20,30},{40,10,60},{70,80,90}};
				int min=num[0][0];
				int max=num[0][0];
				for(int i=0;i<num.length;i++) {
					for(int j=0;j<num[i].length;j++) {
						if(num[i][j]>max) {
							max=num[i][j];
						}else if(num[i][j]<min) {
							min=num[i][j];
							
						}
		
						System.out.print(num[i][j]+" ");
					}
					System.out.println( );
				}
			
			System.out.println(" max of matrix : "+max);
			System.out.println("min of matrix : "+min);

		}


		

	}


package patterns;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int n =sc.nextInt();
		int c=1;

		for(int i=1;i<n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<n;k++) {
				System.out.print(c);
				c++;
				
			}
			
			for(int m=n*n ;m>n;m--) {
			System.out.print(c);
				c++;
			}
			
			System.out.println();
		}
			
	}
}

package patterns;

import java.util.Scanner;

public class Labtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numebr of rows : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
				
			}
			int a = 1;
			for (int k = 0; k <i; k++) {
				System.out.print(a +" ");
				a=a*(i-k)/(k+1);
			
			}
			System.out.print(a +" ");

			System.out.println();
				

		}
	}

}

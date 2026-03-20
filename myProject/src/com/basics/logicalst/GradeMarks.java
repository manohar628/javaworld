package com.basics.logicalst;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks : ");
		int marks =sc.nextInt();
		sc.close();
		if (marks==100) {
			System.out.println("excellent student grade :A ");
			
		}else if(marks>=90  && marks<100){
			System.out.println("good student grde B:");
			
		}else if (marks >=60 && marks<90) {
			System.out.println(" avg student Grade c");
		}
		else {
			System.out.println("below avg Student");
		}

	}

}

package com.fundamentals.operators;
import java.util.Scanner;
//syntax --> 
//condition? valu_is true :value_is_false 
public class Ternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int max =(a>b)? a : b;
		System.out.println("max value of above : "+max);
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your age : ");
		int age =sc.nextInt();
		 boolean isEligible =(age>18)?true :false;
		 System.out.println(isEligible);
		 String  man=(age>18)? "Yes" : "No";
		 System.out.println(man);
		 
		 
		 int x=10;
		 int y=20;
		 int z=5;
		 
		 int great=(x>z)?(x>y?x:y):(y>z?y:z);
		 System.out.println(great);
		 sc.close();
	}

}

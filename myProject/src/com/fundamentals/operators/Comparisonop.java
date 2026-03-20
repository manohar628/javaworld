package com.fundamentals.operators;

public class Comparisonop {
//all comaprison operator will gooing return the bolean values output like True or False
	public static void main(String[] args) {
		int i = 87;
		int j = 99;
		System.out.println(i == j);
		float f = 10.5f;
		double b = 10.5;
		System.out.println(f == b);
		char c = 'A';
		char c1 = (char) 65;
		System.out.println(c == c1);
		String s1="manohar";
		String s2="manohar";
		System.out.println(s1==s2);
		
		String s3=new String("man");
		String s4= new String("man");
		
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		
		int x=5;
		int y=5;
		int z=7;
		 System.out.println( x>y);
		 System.out.println(x>z);
		 System.out.println( x>=y);
		 System.out.println(x>=z);
		 

	}

}

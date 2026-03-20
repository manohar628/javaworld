package com.fundamentals.operators;

public class logicalop {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 100;

		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(false && false);
System.out.println("************************");
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("************************");
		System.out.println(a==b && a==c);
		System.out.println( a>b && a==c );
		System.out.println( a==c&& a<b);
		System.out.println( a<c&& a!=c );
		System.out.println("************************");

		System.out.println(a==b || a==c);
		System.out.println( a>b || a==c );
		System.out.println( a==c || a<b);
		System.out.println( a<c|| a!=c );
		System.out.println("************************");

	}

}

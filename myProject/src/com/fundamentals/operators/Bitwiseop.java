package com.fundamentals.operators;

public class Bitwiseop {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 100;
		System.out.println("************************");
		System.out.println(a & c);
		System.out.println(a & b);
		System.out.println(b & c);
		System.out.println(b & a);
		System.out.println("************************");

//		System.out.println("************************");
		System.out.println(a | c);
		System.out.println(a | b);
		System.out.println(b | c);
		System.out.println(b | a);
		System.out.println("************************");
		System.out.println("************************");
		System.out.println(a ^ c);
		System.out.println(a ^ b);
		System.out.println(b ^ c);
		System.out.println(b ^ a);
		System.out.println("************************");

		System.out.println("************************");
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(~c);

		System.out.println("************************");

//

	}

}

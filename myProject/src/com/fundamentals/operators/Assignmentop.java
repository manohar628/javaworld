package com.fundamentals.operators;

public class Assignmentop {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
//		
		a += b;
		System.out.println(a);
		a = +b;
		System.out.println(a);
		a -= b;
		System.out.println(a);
		a = -b;
		System.out.println(a);
		a *= b;
		System.out.println(a);
//		syntax error on token "*", delete this token
//		a =* b;
//		System.out.println(a);

		a /= b;
		System.out.println(a);
//		syntax error on token "/", delete this token
//		a = /b;
//		System.out.println(a);

		a %= b;
		System.out.println(a);
//		syntax error on token "%", delete this token
//		a = %b;
//		System.out.println(a);

	}

}

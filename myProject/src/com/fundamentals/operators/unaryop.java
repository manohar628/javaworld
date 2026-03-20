package com.fundamentals.operators;

public class unaryop {

	public static void main(String[] args) {
		int i = +10;
		int j = -10;
		System.out.println(i);
		System.out.println(j);

		int m = 10;
		int n = 5;
		System.out.println(++m);
		System.out.println(++n);
		System.out.println(++m);
		System.out.println(++n);
		System.out.println(++m);
		System.out.println(++n);
	
	int c=11;
		int d=12;
		System.out.println(++c);
		System.out.println(++d);
		System.out.println(c++);
		System.out.println(d++);
		System.out.println(++c);
		System.out.println(++d);
		
		System.out.println(++c + ++d +c++ + d++);
		System.out.println(++c + ++d  - c++ + d++);
		
		System.out.println("c value "+c);
		System.out.println("d value "+d);
		

	}

}

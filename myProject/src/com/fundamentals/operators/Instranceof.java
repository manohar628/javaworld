package com.fundamentals.operators;

class A {

}

class B extends A {

}

public class Instranceof {

	public static void main(String[] args) {
		Integer i = 50;
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);

//		String s="manohar";
//		System.out.println(s instanceof Integer);compiletime Error
		Integer f = null;
		System.out.println(f instanceof Integer);
		System.out.println(f instanceof Number);

		A a = new A();
		B b = new B();

		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);

	}

}

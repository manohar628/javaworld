package com.fundamentalmethods;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("man method starteed");
		Method2 m = new Method2();
		m.addition();
		m.sub();
		m.multy();
		m.div();
		m.mod();
		
//		it doesn't return anything but it going represent statement 

	}

	void addition() {
		int a=330;
		int b =444;
		System.out.println(a+b);

	}
	void sub() {
	byte a=121;
		byte b =120;
		System.out.println(a-b);
	}
	void multy() {
		short a=12;
		int b =4;
		System.out.println(a*b);
		
		}
	void div() {
		long a=100000000000l;
		long b=456;
		System.out.println(a/b);
		
	}
	void mod() {
		double a=100000.00d;
		double b=65335.000d;
		System.out.println(a%b);
	}

 }
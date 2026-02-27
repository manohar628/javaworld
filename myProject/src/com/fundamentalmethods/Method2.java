package com.fundamentalmethods;
//no argument no return type

public class Method2 {
//in java wee didn't call instance method in static method so we removed public static this way of representing was avaiable by java 25
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
		int a=555;
		int b =444;
		System.out.println(a-b);
	}
	void multy() {
		int a=12;
		int b =4;
		System.out.println(a*b);
		
		}
	void div() {
		int a=100;
		int b=4;
		System.out.println(a/b);
		
	}
	void mod() {
		int a=100;
		int b=3;
		System.out.println(a%b);
	}

 }

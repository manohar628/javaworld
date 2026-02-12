package com.basics;

public class method1 {
	void methodE() {
		System.out.println("method E called");
	}
	static void methodA() {
		System.out.println("method A called");
		method1 m= new method1();
		m.methodB();
		
	}
	void methodB() {
		System.out.println("method B called");
		methodD();
		methodC();
		
	}
	void methodC() {
		System.out.println("method C called");
	}

	static void methodD() {
		System.out.println("Method D called");
		method1 m= new method1();
		m.methodE();
		
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		methodA();
		


	}

}

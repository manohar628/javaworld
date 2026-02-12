package com.basics;

public class Manohar {
	void show() {
		System.out.println("show method called");
		}
	
	

	public static void main(String[] args) {
		System.out.println("main method");
		hello();
	}
	static void hello() {
		System.out.println("hello method called");
		Manohar m=new Manohar();
		m.show();
	}
	
}


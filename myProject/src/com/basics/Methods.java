package com.basics;

public class Methods {
	public static void show() {
		System.out.println(" static method called ");
		
	}

	public static void main(String[] args) {
		System.out.println("main method Started");
		System.out.println(Thread.currentThread());
		Methods m=new Methods();
		m.hello();
		show();
	

	}
	public void hello() {
		System.out.println("instance method called");
	}

}

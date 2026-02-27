package com.fundamentalmethods;

//with arguments no return type
public class TestMethods {

	void main(String[] args) {
		System.out.println("main methoid started");
		greet("good morning");
		Addition(20, 30);
		Sub(20, 400);
		Sint("good moring ", 22);
		div(100, 23);
		mod(1000, 30);

	}

	void greet(String wish) {
		System.out.println(" Greeting " + wish);
	}

	void Addition(int a, int b) {
		System.out.println(a + b);
	}

	void Sub(float a, double b) {
		System.out.println("going for Multiplication");

		System.out.println(a * b);
	}

	void Sint(String a, int b) {
		System.out.println(" greetings " + a);
		System.out.println(" time will be " + b);

	}

	void div(float a, double b) {
		System.out.println("Division");
		System.out.println(a / b);
	}

	void mod(int a, int b) {
		System.out.println(" Mod :");
		System.out.println(a % b);
	}
}

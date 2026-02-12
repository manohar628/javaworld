package com.basics;

public class Blocks1 {

	public static void main(String[] args) {
		System.out.println("main block Started");
	}
//	static block
	static {
		System.out.println("static block started");
	}
//	instance block
	{
		System.out.println("instance block started");
	}
}

package com.basics;

public class Stackoverflow {
	public static void main (String[] args) {
		System.out.println("main block");
			
	}
	static {
		System.out.println("static block");
		Stackoverflow s1 =new Stackoverflow();
		
		
	}
	{
		System.out.println("instance block");
		Stackoverflow s1 =new Stackoverflow();
		
	}
	

}

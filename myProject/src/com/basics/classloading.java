package com.basics;

public class classloading {

	public static void main(String[] args) throws ClassNotFoundException{
	System.out.println("class laoding started");
	
	Class.forName("com.basics.array");
	System.out.println("Class loaded successfulyy!!");

	}

}

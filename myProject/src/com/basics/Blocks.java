package com.basics;

public class Blocks {
	static int a=0;
	
	{
		a=a+1;
	}

	public static void main(String[] args) {
		Blocks b=new Blocks();	
		Blocks b1=new Blocks();	
		System.out.println(a);

	}

}

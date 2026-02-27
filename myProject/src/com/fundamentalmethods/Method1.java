package com.fundamentalmethods;

public class Method1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		getaddition(20,30);
		
		

	}
	static void   getaddition(int a,int b) {
		
		int c=a+b;
		
		System.out.println("addtion :"+(a+b));
		getsub(100,c);
	}
		
	static void getsub(int a,int b) {
		System.out.println("sub :"+(a-b));
		int e=a-b;
		Method1 m=new Method1();
		m.multiplication(2,e);
		
	}
	void multiplication(int a,int b) {
		int d=a*b;
		System.out.println("mul :"+a*b);
		div(d,4);
	}
	void div(int a, int b) {
		System.out.println("division :"+ (a/b));
	}
	

}

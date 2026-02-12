package com.basics;

class A{
	B b;
	
	protected void finalise() throws Throwable{
		System.out.println("finalise called");
		
	}
	

	
}
class B {
	A a;
	protected void finalise() throws Throwable{
		System.out.println("finalise called");
		
	}
}


public class TestIslandOfIsolation {
	
	public static void main(String[] args) {
		
		System.out.println("main method Started");
		
		A obj1=new A();
		B obj2= new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		
		System.gc();
		System.out.println("main method ended");

	}

}

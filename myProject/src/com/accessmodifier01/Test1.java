package com.accessmodifier01;

//illegal modifier for the class Test1; only public, <default> ,abstract & final are permitted
public class Test1 {
	static {
		System.out.println("static block called");
	}

	{
		System.out.println("instance block called");
	}
	
//	protected data members
	protected int id4=99;
	protected String name4="mahi";
	protected void method4() {
		System.out.println("method4 called");
	}
	
//	public data members
	public int id3=9;
	public String name3="manohar";
	public void method3() {
		System.out.println("method3 accesed");
	}
//	protected Test1() {
//		System.out.println("hello no arg constructor");
//	}

//	 default data members
	 int id2 = 18;
	String name2 = "vk";

	void method2() {
		System.out.println("defautl method2 called");
	}

//	private not allowed for blocks
//	Syntax error, insert "Identifier" to complete CompactConstructorHeader
//	private static {
//		
//	}
//	private{
//		
//	}

//	private data members
	private int id1 = 07;
	private String name1 = "MSD";

	private void method1() {
		System.out.println("method1 called");
	}

//	private for constructor yes but it stop the creation of object 
//	public Test1() {
//		System.out.println("hello no arg constructor");
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Test1 t1 = new Test1();

//		accessing the private data members within the class
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();
//		accessing the default data members within the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();
		
//		accessing the public  data members within the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
//		accessing the protected   data members within the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();
	}

//	a class inside the class is called inner class used to work with the temporary requirents
	private class manu {

	}

}

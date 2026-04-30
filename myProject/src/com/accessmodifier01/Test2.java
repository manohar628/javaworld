package com.accessmodifier01;

// NOTE: in java the default package is java.lang and current package
//so we not need to import within the package class
public class Test2 {

	public static void main(String[] args) {
		System.out.println("main method of test2 called");
		Test1 t1 = new Test1();
//		The field Test1.id1 is not visible
//		we cannot accessing outside class but we create object if the constructor is  not private
//		System.out.println(t1.id1);
//		System.out.println(t1.name1);
//		t1.method1();

//		accessing the default data members within the class and outside of the class and within package
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();
		
//		accessing the public  data members outside the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
//		accessing the protected   data members within the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();
	}

}

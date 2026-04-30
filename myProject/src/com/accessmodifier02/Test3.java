package com.accessmodifier02;
import com.accessmodifier01.Test1;
public class Test3  extends Test1{

	public static void main(String[] args) {
		System.out.println("main method started from test3 class");
//		accessing the public  data members outside the package
		Test1 t1=new Test1();
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		Test3 t3=new Test3();
//		accessing the protected   data members outside package are not allowed 
//		but allowed when we import package with class and extends it as super class
//		and accessed by the sub or this class object reference
		System.out.println(t3.id4);
		System.out.println(t3.name4);
		t3.method4();
	}

}

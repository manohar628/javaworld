package com.basics;

public class Addressofobj {
//	@override
	protected void finalize() throws Throwable{
		System.out.println("finalized method called");
	}
	static void hello() {
		System.out.println(" hello methid called");
		Addressofobj obj4 = new Addressofobj();
		System.out.println(obj4);
		System.out.println(" hello methid ended");
		
		
	}

	public static void main(String[] args) {
		Addressofobj obj = new Addressofobj();
		Addressofobj obj1 = new Addressofobj();
		Addressofobj obj2 = new Addressofobj();
		Addressofobj obj3 = new Addressofobj();
//		Addressofobj obj = new Addressofobj();
//		com.basics.Addressofobj@2b2fa4f7
//		System.out.println(obj);
//		
//		Addressofobj obj1 = new Addressofobj();
//		com.basics.Addressofobj@1dbd16a6
//		System.out.println(obj1);
//		
//		Addressofobj obj2 = new Addressofobj();
//		com.basics.Addressofobj@7ad041f3
//		System.out.println(obj2);
//		
//		Addressofobj obj3 = new Addressofobj();
//		com.basics.Addressofobj@251a69d7
//
//		System.out.println(obj3);
		obj= null;
		obj1=obj3;
		new Addressofobj();
		
//		com.basics.Addressofobj@2b2fa4f7
		System.out.println(obj);
		
		
//		com.basics.Addressofobj@1dbd16a6
		System.out.println(obj1);
		
		
//		com.basics.Addressofobj@7ad041f3
		System.out.println(obj2);
		
		
//		com.basics.Addressofobj@251a69d7

		System.out.println(obj3);
		hello();
		System.gc();
	}

}

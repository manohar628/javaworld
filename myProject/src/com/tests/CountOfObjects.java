package com.tests;

		


public class CountOfObjects {
	static int a=0;
	
//	public CountOfObjects() {
//		a++;
//	}
	
//	public CountOfObjects(int value) {
//		a++;
//	}
	public static int GetObjectCount() {
	 
		return a;
	}


	public static void main(String[] args) {
		CountOfObjects a=new CountOfObjects();
		CountOfObjects b=new CountOfObjects();
		CountOfObjects c = new CountOfObjects();
		
		System.out.println(" number of object created : "+CountOfObjects.GetObjectCount());
	}

}

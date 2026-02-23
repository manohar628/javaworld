package com.fundamentals;

public class Wrapperdt {

	public static void main(String[] args) {
		int i = 10;
		Integer i1 = i;

		System.out.println(i1);// primitive to wrapper is called auto boxing
		Integer i2 = 88;
		int i3 = i2;
		System.out.println(i3);// convering wrapper to primitive is called auto unboxing
		
		
		Integer i4= 222;
		Integer i5= 222;
		
		System.out.println(i4==i5);
		Integer i6=257;
		Integer i7=257;
		System.out.println(i6==i7);
	}

}

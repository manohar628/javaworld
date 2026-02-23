package com.fundamentals;

public class FloatingLiterals {

	public static void main(String[] args) {
		float f = 101;
		float f1 = 0123;
		float f2 = 123F;
//		float f3 = 123.5;double cannot convert into float but float can convert into double
		float f4 = 123.5F;
		float f5 = 0x543;
		float f6 = 0123.5F;

		float f8 = 0x142F;

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f8);

		System.out.println("double literals***");
		double d = 101;
		double d1 = 0123;
		double d2 = 123F;
		double d3 = 123.5;

		double d4 = 123.5F;
		double d5 = 0x543;
		double d6 = 0123.5F;

		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		System.out.println(d5);
		System.out.println(d6);

	}

}

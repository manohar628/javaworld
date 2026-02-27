package com.fundamentals;

public class Test {
	static int num = 6657;

	public static void main(String[] args) {
		System.out.println("main method started");

		int thousand = (num / 1000) % 10;
		int hundred = (num / 100) % 10;
		int tens = (num / 10) % 10;
		int ones = (num / 1) % 10;
		System.out.println("thousands " + thousand);
		System.out.println("Hundreds  " + hundred);
		System.out.println("tens " + tens);
		System.out.println("ones " + ones);

		int t = (num / 1000) * 1000;
		int h = (num / 100) * 100;
		int te = (num / 10) * 10;
		int o = (num / 1) * 1;

		System.out.println("thousands " + t);
		System.out.println("Hundreds  " + h);
		System.out.println("tens " + te);
		System.out.println("ones " + o);

	}

}

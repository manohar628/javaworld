package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class DataTypes3 {
	BigInteger b = new BigInteger("588");
	BigInteger a = new BigInteger("578734");

	public static void main(String[] args) {
		DataTypes3 c = new DataTypes3();
		System.out.println(c.b);
		System.out.println(c.a);

		System.out.println(c.b.add(c.a));
		System.out.println(c.b.multiply(c.a));
		System.out.println(c.b.divide(c.a));
		System.out.println(c.a.doubleValue());
		System.out.println(c.b.gcd(c.a));
		System.out.println(c.b.max(c.a));
		System.out.println(c.b.min(c.a));
		System.out.println(c.b.mod(c.a));

		// TODO Auto-generated method stub

	}

}

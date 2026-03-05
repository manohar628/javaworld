package com.tests;


public class Storage {

	double price = 19.99;
	double quantity = 2.5;

	public static void main(String[] args) {
		int age = 21;
		float marks = 9.7f;
		char Grade = 'A';
		Storage s = new Storage();

		System.out.println(" integer size :" + Integer.SIZE);
		System.out.println(" integer max value :" + Integer.MAX_VALUE);
		System.out.println(" integer min value :" + Integer.MIN_VALUE);

		System.out.println(" double size :" + Double.SIZE);
		System.out.println("  double max value :" + Double.MAX_VALUE);
		System.out.println(" double  min value :" + Double.MIN_VALUE);

		System.out.println(" byte size :" + Byte.SIZE);
		System.out.println(" byte max value :" + Byte.MAX_VALUE);
		System.out.println(" byte min value :" + Byte.MIN_VALUE);

		double totalcost = s.price * s.quantity;

		System.out.println(age);
		System.out.println(marks);
		System.out.println(Grade);

		System.out.println("price per unit :" + s.price);
		System.out.println("Quantity : " + s.quantity);
		System.out.println("total cost :" + totalcost);

	}

}

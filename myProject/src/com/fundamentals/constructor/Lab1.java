package com.fundamentals.constructor;

class Vehicle {
	String Brand;

	public Vehicle(String brand) {

		this.Brand = brand;
	}

}

class Car extends Vehicle {
	String name;
	int model;
	double price;

	public Car(String brand, String name, int model, double price) {
		super(brand);
		this.name = name;
		this.model = model;
		this.price = price;
	}

}

class Electriccar extends Car {
	int Battery;
	int capacity;

	public Electriccar(String brand, String name, int model, double price, int battery, int capacity) {
		super(brand, name, model, price);
		Battery = battery;
		this.capacity = capacity;
	}

	void display() {
		System.out.println("brand " + Brand);
		System.out.println("name " + name);
		System.out.println("model " + model);
		System.out.println(" price " + price);
		System.out.println("battery " + Battery);
		System.out.println("capacity " + capacity);
	}

}

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("main method started :");
//		Vehicle v = new Vehicle("Mahendra");
		Electriccar e = new Electriccar("Mahendra", "thar", 2017, 57847567d, 68, 88);
		e.display();

	}

}

package com.fundamentals;

class Student {
	int id;
	String name;
}

class Address {
	int flat;
	String street;

}

public class UserDefined {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);

		Address a = new Address();
		System.out.println(a.flat);
		System.out.println(a.street);

	}

}

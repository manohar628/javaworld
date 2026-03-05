package com.fundamentalmethods;

class Student {
	String name;
	int id;

}

public class FactoryMethod {

	public static void main(String[] args) {
		System.out.println(" you Enter main  method ");

		Student s1 = CreatingStudent();
		s1.name = "manohar";
		s1.id = 77;
		System.out.println(" Student id : " + s1.id);
		System.out.println(" Student Name : " + s1.name);

	}

	static Student CreatingStudent() {
		Student s = new Student();
		return s;
	}

}

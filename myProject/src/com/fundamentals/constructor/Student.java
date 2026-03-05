package com.fundamentals.constructor;
//Question:
//1) Create a class named Student with the following data members:
//name
//marks1
//marks2
//marks3
//total
//average
//
//Requirements:
//The constructor should accept name, marks1, marks2, and marks3 as parameters.
//Inside the constructor:
//Calculate the total marks.
//Calculate the average marks.
//Create a method to display all student details.

public class Student {
	String name;
	float marks1;
	float  marks2;
	float marks3;
	double total;
	double average;
	
	
	
	

	public Student(String name, float marks1, float marks2, float marks3) {
		System.out.println("parameterized constructor called ");
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		double total=(marks1+marks2+marks3);
		this.total=total;
		double avg=(marks1+marks2+marks3)/3;
		this.average=avg;

	}

	public static void main(String[] args) {
			System.out.println("Main method Started");
			Student s=new Student("Manohar",7.5f,7.5f,7.5f);
			s.display();
			Student s1=new Student("Madan",9.0f,9.0f,9.0f);
			s1 .display();
		}
	void display() {
		System.out.println(" Name of the Student : "+name);
		System.out.println(" Marks1 : "+marks1);
		System.out.println(" Marks2 : "+marks2);
		System.out.println(" Marks3 : "+marks3);
		
		System.out.println("Calculations ********");
		
		System.out.println("Toatal Marks of the Student : "+total);
		System.out.println("average marks of the student : "+average);
	}

}

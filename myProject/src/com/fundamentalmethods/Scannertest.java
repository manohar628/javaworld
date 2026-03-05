package com.fundamentalmethods;

import java.util.Scanner;

public class Scannertest {

	void main(String[] args) {
		System.out.println(" examples of Scanner");

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter employee ID :  ");
		long Id = sc.nextLong();

		System.out.println(" enter your  name :");
		String Name = sc.next();

		System.out.println(" enter employee age :");
		int age = sc.nextInt();
		
		System.out.println("Enter employe gender");
		;
		char gender =sc.next().charAt(0);

		System.out.println(" Enter Employee salary :");
		double sal = sc.nextDouble();

		EmployeeId(Id);
		EmpolyeeName(Name);
		getEmployeeAge(age);
		Employeegender(gender);
		System.out.println("Employee salary : " + EmployeeSalary(sal));

		sc.close();

	}

	void getEmployeeAge(int age) {
		System.out.println(" Employee age: " + age);
	}

	void EmpolyeeName(String a) {
		System.out.println("Employee Name : " + a);
	}

	void EmployeeId(long a) {
		System.out.println("Employee Id : " + a);
	}

	double EmployeeSalary(double b) {

		return b;
	}
	void Employeegender(char g) {
		System.out.println(" Employee GEnder " +g);
	}

}

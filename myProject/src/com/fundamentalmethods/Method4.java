package com.fundamentalmethods;
//no arguments with return type

public class Method4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Method4 m= new Method4();
	System.out.println(" ages "+m.Age());
	System.out.println(m.Age());
	System.out.println(marks());
	System.out.println("employee "+(m.getsalary()+m.Bonu()));
	System.out.println(m.Ages());
	System.out.println("full name: "+m.name());
	System.out.println(m.getSno());
	}
	byte getSno() {
		return 2;
	}
	int Age() {
		int age=21;
		return age;
		
		
		
	}
	int Ages() {
		int age1=21;
		int age2=22;
		int age3=23;
		return age1+age2+age3;
	}
	String name() {
		String firstname ="venkata";
		String  lastname= "manohar";
		return firstname+lastname;
	}
	static byte marks() {
		byte smarks=12;
		return smarks;
	}
	double getsalary() {
		double salary=1622672.000;
		return salary;
	}
	double Bonu() {
		double  bonus =100000.00;
		return bonus;
	}
}


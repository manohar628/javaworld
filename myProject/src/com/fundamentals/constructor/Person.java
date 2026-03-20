package com.fundamentals.constructor;

public class Person {
	String name="manohar";
}
	 class Employee extends Person{
		String name ="nandhan";
		
	
	void display() {
		System.out.println("Employe name "+this.name);
		System.out.println("Person name "+super.name);
	}
	

	public static void main(String[] args) {
		Person p=new Person();

		
		Employee n=new Employee();
		n.display();
		
		
    
	}

}

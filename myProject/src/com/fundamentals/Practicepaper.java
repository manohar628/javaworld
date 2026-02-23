package com.fundamentals;

class Practicepaper {

	// Static variable
	static int totalEmployees;

	// Instance variable to store employee number
	int employeeNumber;

	// Static block (runs only once)
	static {
		System.out.println("Company Started");
		totalEmployees = 0;
	}

	// Instance block (runs every time object is created)
	{
		System.out.println("New Employee Joining");
		totalEmployees++;
		employeeNumber = totalEmployees;
	}

	// Static method
	static int getTotalEmployees() {
		return totalEmployees;
	}

	// Instance method
	void displayEmployeeNumber() {
		System.out.println("This is employee number: " + employeeNumber);
	}

	// Main method
	public static void main(String[] args) {

		Practicepaper e1 = new Practicepaper();
		e1.displayEmployeeNumber();

		Practicepaper e2 = new Practicepaper();
		e2.displayEmployeeNumber();

		Practicepaper e3 = new Practicepaper();
		e3.displayEmployeeNumber();

		System.out.println("Total Employees: " + Practicepaper.getTotalEmployees());
	}
}

package com.tests;
//1. Flight Booking System – Encapsulation (Immutable Passport Number)
//Create a Passenger class in Java where the passport number should be immutable after object creation (cannot be changed), while other details like name, contact, and email can be modified using setters. Implement this using encapsulation.


public class TestFlightBookingTicket {

	public static void main(String[] args) {
		FlightBookingTicket t =new FlightBookingTicket("Manohar","Hyderanad","venkatamanohar62@gmail.com",465343);
	
		
		System.out.println("name : "+t.getName());
		System.out.println("Address : "+t.getAddress());
		System.out.println("Email : "+t.getEmail());
		System.out.println("Passport Number : "+t.getPassportnum());
	System.out.println("*******************");
		t.setName("venkata");
//		t.setpassportnum); its not modifiable because it used final keyword and we written it as only getter not setter
		System.out.println("name : "+t.getName());
		System.out.println("Address : "+t.getAddress());
		System.out.println("Email : "+t.getEmail());
		System.out.println("Passport Number : "+t.getPassportnum());
	

	}

}

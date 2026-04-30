package com.tests;
  
  

public class FlightBookingTicket {
	
	private String name;
	private String Address;
	private String email;
	
	private final long Passportnum;
	
	public FlightBookingTicket(String name, String address, String email, long passportnum) {
		super();
		this.name = name;
		Address = address;
		this.email = email;
		Passportnum = passportnum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public double getPassportnum() {
		return Passportnum;
	}
	
	
	

}

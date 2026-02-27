package com.fundamentalmethods;
import java.util.Scanner;

public class Bank {
	 long AccNo;
	 String Name;
//	 double Balance;
	 long Pin;

	public static void main(String[] args) {
		System.out.println(" Welcome to union banks of india");
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your account Number : ");
		long acc=sc.nextLong();
		
		System.out.println("Enter your fullname : ");
		String AccName=sc.next();
		
		System.out.println("check your balance :");
		double bal=sc.nextDouble();
		
		
		
		
		
		System.out.println(" Your Account Number : "+accountNumber(acc));
		System.out.println( "your Name " +Name(AccName));
		System.out.println("Your balance : "+Balance(bal));
		sc.close();
		
		
	}
	static long accountNumber(long accno) {
		return accno;
	}
	static String Name(String a) {
		return a;
	}
	static double Balance(double b){
	return b;
		
		
	}
	
	
	
	

}

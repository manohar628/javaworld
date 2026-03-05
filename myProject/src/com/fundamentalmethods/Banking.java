package com.fundamentalmethods;

import java.util.Scanner;

public class Banking {
	String name;
	double balance;
	long accno;

	void deposit(double d) {
		double c = d + balance;
		System.out.println(" Your deposited amount: " + d);
		System.out.println(" Your Balance : " + c);

	}

	void Withdraw(double e) {
		double f = balance - e;
		System.out.println(" withdrawn amount : " + e);
		System.out.println(" Your Total Balance : " + f);
	}

	public static void main(String[] args) {

		System.out.println(" welcome to union bank of india ");
		Scanner sc = new Scanner(System.in);

		Banking a = new Banking();
		a.accno = 351351351;
		a.name = "manohar";
		a.balance = 500000;

		System.out.println("Banker Name :" + a.name);
		System.out.println("Banker Account Number :" + a.accno);
		System.out.println("Banker balance :" + a.balance);

		System.out.println(" enter deposit amount :");
		long amt = sc.nextLong();

		a.deposit(amt);

		System.out.println(" Enter amount to Withdraw : ");
		long amt1 = sc.nextLong();

		a.Withdraw(amt1);
//		Banking b = new Banking();
//		b.name = "madan";
//		b.accno = 545145185;
//		b.balance = 435651;
		sc.close();
//		System.out.println("Banker Name :" + b.name);
//		System.out.println("Banker Account Number :" + b.accno);
//		System.out.println("Banker balance :" + b.balance);

	}

}

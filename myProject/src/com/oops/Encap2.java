package com.oops;

public class Encap2 {

	private double balance;

	public void setbalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}

	public double getbalance() {
		return balance;
	}
}

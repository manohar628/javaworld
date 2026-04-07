package com.basics.logicalst;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String username = "admin";
		String password = "admin@123";
		int attempts = 0;

		Scanner sc = new Scanner(System.in);

		while (attempts < 3) {

			System.out.println("enter your username :");
			String user = sc.next();

			System.out.println("enter your password :");
			String pass = sc.next();

			if (user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Login successfull");
				break;
			} else {
				System.out.println("Check your Username and password");
				attempts++;
			}
		}
		if (attempts == 3) {
			System.err.println(" your Account blocked for 24hr");
		}

		sc.close();
	}

}

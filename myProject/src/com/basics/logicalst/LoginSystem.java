package com.basics.logicalst;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
	System.out.println("Welcome to login page");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
		String username=sc.next();
		String Password=sc.next();
		if (username.equals("admin")) {
			if(Password.equals("@12345")) {
				System.out.println("login succesfull");
				
			}else {
				System.out.println("password is incorrect");
			}
			
		}else {
			System.out.println("user name not found");
		}
		sc.close();

	}

}

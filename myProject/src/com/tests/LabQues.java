package com.tests;


import java.util.Scanner;

public class LabQues {
	static double price=1500;
	
	double CalculateItemTotal(double price, double quantity) {
		double total=price*quantity;
//		System.out.println(" your total amount :"+total);
		return total;
	
		
	}
		

	
	double addGST(double amount) {
		
		double gst=amount * 0.05;
		return amount+gst ;
		
		
	}
	double addDeliveryCharges(double price) {
		
		double charges=40;
		return price+charges;
		
	}
	void printBill(double finalAmount) {
		
		System.out.println(" your total Amolunt should be : "+finalAmount);
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("welcome to smartcart sir ");
		
		LabQues i=new LabQues();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of qunatity you want : ");
		double quantity=sc.nextDouble();
		
		i.CalculateItemTotal(price,quantity);
		double m=i.CalculateItemTotal(price,quantity);
		i.addGST(m);
		double WithGST=i.addGST(m);
		i.addDeliveryCharges(WithGST);
		double withCharges =i.addDeliveryCharges(WithGST);
		i.printBill(withCharges);
		sc.close();
		
	
		
	
		
		
				
		
		
	}

}

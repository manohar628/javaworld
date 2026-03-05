package com.tests;

public class Counting {
	
	
	static int count;
	Counting(){
		count++;
	}
	
	

	public static void main(String[] args) {
		Counting c1=new Counting();
		Counting c2=new Counting();
		Counting c3=new Counting();
		
		System.out.println(" Total number of objects creatd :"+Counting.count);
		

	}

}

package com.oops;

public class AccessEncap1 {

	public static void main(String[] args) {
		Encap1 e=new Encap1();
		e.setsid(01);
		System.out.println("Student ID : "+e.getsid());
		
		e.setsname("Manohar");
		System.out.println("Student ID : "+e.getsname());

		
		e.setphone(4756477337l);
		System.out.println("Student ID : "+e.getphone());

		
	}

}

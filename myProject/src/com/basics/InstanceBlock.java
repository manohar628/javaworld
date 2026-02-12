package com.basics;

public class InstanceBlock {
	 static InstanceBlock b1=new InstanceBlock();

	public static void main(String[] args) {
		System.out.println("main block Started");
		 InstanceBlock b2=new InstanceBlock();
		
		}
//		static block
		static {
			System.out.println("static block started");
			 InstanceBlock b1=new InstanceBlock();
			
		}
//		instance block
		{
			System.out.println("instance block started");
		}
	

	
}

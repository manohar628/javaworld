package com.fundamentals;

public class DataTypes {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
    boolean boo;
    
	

	public static void main(String[] args) {
		
		 DataTypes t1= new  DataTypes();
		 t1.b=(byte) 128;
		 
		
		 System.out.println(" BYTE VALUE :"+ t1.b);
		System.out.println("SHORT VALUE :"+t1.s);
		System.out.println(" INTEGER VALUE :"+t1.i);
		System.out.println(" LONG VALUE :"+t1.l);
		System.out.println(" FLOAT VALUE :"+t1.f);
		System.out.println(" DOUBLE VALUE :"+t1.d);
		System.out.println(" char VALUE :"+t1.c);
		System.out.println(" boolean VALUE :"+t1.boo);
	}

}

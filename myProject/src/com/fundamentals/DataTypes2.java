package com.fundamentals;

public class DataTypes2 {
	byte b = (byte) 255;
	short s = 31224;
	int i = 214464676;
	long l = 35452635727l;
	float f = 466246.423444f;
	double d = 2773538.2963983726d;

	char c = 'g';
	char c1 = 655;
	char c2 = 100;
	char c3 = '\u3788';
	int i1 = 'v';
	
	boolean boo =true;
	boolean bi=false;

	public static void main(String[] args) {
		System.out.println(" main method started ");
		DataTypes2 z = new DataTypes2();

		System.out.println(" byte  " + z.b);
		System.out.println(" short  " + z.s);
		System.out.println(" int	 " + z.i);
		System.out.println(" long  	" + z.l);
		System.out.println(" float	" + z.f);
		System.out.println(" byte	" + z.d);
		System.out.println(" char  " + z.c);
		System.out.println(" char  " + z.c1);
		System.out.println(" char  " + z.c2);
		System.out.println(" char  " + z.c3);
		System.out.println(" int	 " + z.i1);
		
		if(z.boo) {
			System.out.println("welcome to java world");
		}
		if (z.bi) {
			System.out.println("yes your in javaworld");
		}else {
			System.out.println("hvdha");
		}

	}

}

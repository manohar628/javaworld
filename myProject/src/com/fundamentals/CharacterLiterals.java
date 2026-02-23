package com.fundamentals;

public class CharacterLiterals {

	public static void main(String[] args) {
		char c = 'a';
		char c1 = 'A';
		char c2 = 123;
		char c3 = '\u0056';
		char c4 = 12345;

		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println("String Literals*********");
		String s = "manohar";
		String s1 = "manohar";
		String s4 = "venkata";

		String s3 = new String("venkatamnaohar");

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);

		System.out.println(s.equals(s1));
		System.out.println(s.equals(s4));

		System.out.println(s == s1);
		System.out.println(s == s3);
	}

}

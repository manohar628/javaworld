package com.fundamentals;

public class TypesofVariables1 {
	int id;

	static String CollegeName = "manohar";

	public static void main(String[] args) {

		System.out.println("main method started");
		TypesofVariables1 q = new TypesofVariables1();
		q.id = 101;
		System.out.println(q.id);
		System.out.println(q.CollegeName);

		TypesofVariables1 q1 = new TypesofVariables1();
		System.out.println(q1.id);
		System.out.println(q1.CollegeName);

	}

}

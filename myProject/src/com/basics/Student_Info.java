package com.basics;

public class Student_Info {
	int student_ID;
	String student_name;
	char student_gender;
	int student_age;
	int maths;
	int hindi;
	int english;
	 public static void main(String[] args) {
		System.out.println("WELCOME TO STUDENT INFO");
		
		Student_Info s1= new Student_Info();
		
		s1.student_ID=1;
		s1.student_name="Manohar";
		s1.student_gender='M';
		s1.student_age=20;
		System.out.println("STUDENT ID :" +s1.student_ID);
		System.out.println("STUDENT NAME :"+s1.student_name);
		System.out.println("STUDENT GENDER :"+s1.student_gender);
		System.out.println("STUDENT AGE :"+s1.student_age);
		
		s1.maths=99;
		s1.hindi=99;
		s1.english=100;
		s1.display();
		
		System.out.println("****************************");
		Student_Info s2= new Student_Info();
		s2.student_ID=2;
		s2.student_name="madan";
		s2.student_gender='M';
		s2.student_age=21;
		System.out.println("STUDENT ID :" +s2.student_ID);
		System.out.println("STUDENT NAME :"+s2.student_name);
		System.out.println("STUDENT GENDER :"+s2.student_gender);
		System.out.println("STUDENT AGE :"+s2.student_age);
		
		s2.maths=98;
		s2.hindi=99;
		s2.english=95;
		s2.display();
	}
	  void display() {
		 int sum = maths + hindi + english;
		 int avg=sum/3;
		System.out.println("TOTAL MARKS :"+sum);
		System.out.println("AVERAGE MARKS : "+avg);
		
		 
		 
	 }
	
	
}

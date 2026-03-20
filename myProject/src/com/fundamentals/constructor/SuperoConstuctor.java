package com.fundamentals.constructor;
class Animal{
	String name="Puppy";
	void show() {
		System.out.println("Animal  "+name);
		
	}
	
}
class Dog extends Animal{
	String name="Sweety";
	
	void show  () {
	System.out.println("dog : "+super.name);	
	}
}

public class SuperoConstuctor {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();
		

	}

}

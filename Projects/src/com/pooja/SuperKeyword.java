package com.pooja;

class A{
	int a=10;
	//superclass-constructor
	A(String name){
		System.out.println("Welcome" +name);
		
	}
	//Superclass-method
	void myMethod1() {
		System.out.println("I am super class Method");
	}
}
	class B extends A{
		// subclass-constructor
		B () {
			//call the superclass-constructor
			super("Pooja");
		}
		//Subclass-method
		void myMethod2() {
			//access of super class variable
			System.out.println("super class Variable: " +a);
			super.myMethod1();
		}
}

public class SuperKeyword {
	public static void main(String [] args) {
		B b=new B();
		b.myMethod2();
	}

}

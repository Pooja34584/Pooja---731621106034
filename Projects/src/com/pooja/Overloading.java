package com.pooja;
  
   // Method Overloading in Java -> same name with different arguments.

public class Overloading {
     
	 void myMethod(String name) {
		 System.out.println("Welcome" + name);
		 
	 }
	 void myMethod(int a,int b) {
		 System.out.println("Sum :" + (a+b));
	 }
	 void myMethod(int n) {
		 System.out.println("Sum :" + (n+n));
	 }
	 public static void main(String [] args) {
		 Overloading obj= new Overloading();
		 obj.myMethod("Pooja");
		 obj.myMethod(5);
		 obj.myMethod(20,30);
	 }
}

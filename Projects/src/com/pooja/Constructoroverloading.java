package com.pooja;
  
   // Constructor Overloading in Java -> same name with different arguments.

public class Constructoroverloading {
     
	  Constructoroverloading(String name) {
		 System.out.println("Welcome" + name);
		 
	 }
	 Constructoroverloading(int a,int b) {
		 System.out.println("Sum :" + (a+b));
	 }
	 Constructoroverloading(int n) {
		 System.out.println("Sum :" + (n+n));
	 }
	 public static void main(String [] args) {
		 Constructoroverloading obj1= new Constructoroverloading(20,30);
		 Constructoroverloading obj2=new Constructoroverloading("Pooja");
		 Constructoroverloading obj3=new Constructoroverloading(5);
		 }
}

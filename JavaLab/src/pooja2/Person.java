package com.Pooja;
import java.util.Scanner;
class Lab{
	String Name;
	int age;
	String Hello;
Lab(String Name,int age){
	this.Name=Name;
	this.age=age;
	this.Hello=Hello;
}
 void display() {
	 System.out.println("Nmae :" +Name);
	 System.out.println("Age :"+age);
 }
 void hello() {
	 System.out.println("Hello"+Name);
 }
}
  

public class Person {
	
	public static void main(String[] args) {
		Lab obj=new Lab("Pooja",19);
		obj.display();
		//obj.hello();
	}
	}

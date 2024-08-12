package com.pooja;
   //this keyword in java -> this represent the current class keyword
public class Keywords {
	String name;
	Keywords(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	Keywords(int a,int b){
		System.out.println("Addition :" + (a+b));
	}
	 void greeting() {
		 System.out.println("Welcome" +name);
	 }
	 public static void main (String [] args) {
		 Keywords obj =new Keywords("Pooja");
		
	}

}

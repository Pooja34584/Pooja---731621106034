package com.pooja;

  //Types of Method in Java-2types instances,static

public class Method {
	 void myMethod1() {
		 System.out.println("Instance Method");
	 }
	 static void myMethod2() {
		 System.out.println("Static Method");
	 }
	 public static void main(String[] args) {
		 Method obj=new Method();
		 obj.myMethod1();
		 
		 Method.myMethod2();
	 }

}

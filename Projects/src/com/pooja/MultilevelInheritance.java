package com.pooja;

   //MultiLevel Inheritance-> one superclass(parent class)and more child class (subclass) 

class vehicle {
	void NoofEngine(){
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends vehicle{
	void NoofWheels(){
		System.out.println("I have two Wheels");
		
	}
}
 class Bike extends TwoWheeler{
	 void brandName() {
		 System.out.println("Brand Name is Yamaha-R15");
	 }
 }
public class MultilevelInheritance {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.NoofEngine();
		bike.NoofWheels();
		bike.brandName();
	}

}
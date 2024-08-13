package com.pooja;

  // Single Inheritance 
class Twowheeler{
	void NoofWheels(){
		System.out.println("I have two Wheels");
		
	}
}
 class Bike extends Twowheeler{
	 void brandName() {
		 System.out.println("Brand Name is Yamaha-R15");
	 }
 }
public class SingleInheritance {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.NoofWheels();
		bike.brandName();
	}

}

package com.pooja;

class Vechile {
	void NoofEngine(){
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Vechile{
	void NoofWheels(){
		System.out.println("I have two Wheels");
		
	}
}
 class Bike extends TwoWheeler{
	 void brandName() {
		 System.out.println("Brand Name is Yamaha-R15");
	 }
 }
 class Scooty extends TwoWheeler{
	 void brandName() {
		 System.out.println("Brand Name is Activa");
	 }
 }
public class HieraricalInheritance {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.NoofEngine();
		bike.NoofWheels();
		bike.brandName();
		
		Scooty scooty=new Scooty();
		//scooty.NoofEngine();
		//scooty.NoofWheels();
		scooty.brandName();
		
	}

}
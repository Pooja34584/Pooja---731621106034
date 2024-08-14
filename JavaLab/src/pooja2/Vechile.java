package com.Pooja;

class vechiles{
	void drive() {
		System.out.println("Bike");
	}
}
class Car extends vechiles{
	void drive() {
		System.out.println("Repairing a car.");
	}
}

public class Vechile {
    public static void main(String[] args) {
    	Car obj1=new Car();
    	vechiles obj2=new vechiles();
    	obj1.drive();
    	obj2.drive();
    }
}

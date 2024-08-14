package com.Pooja;

class Animal{
	void makeSound() {
		System.out.println("PetAnimals");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("MyCat");
	}
}

public class Main {
    public static void main(String[] args) {
    	Cat obj1=new Cat();
    	Animal obj2=new Animal();
    	obj1.makeSound();
    	obj2.makeSound();
    }
}

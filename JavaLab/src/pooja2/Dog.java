package com.Pooja;
  class dogvarities{
	  String name;
	  String breed;
	  
	  dogvarities(String name,String breed){
		  this.name=name;
		  this.breed=breed;
	  }
  
   String getName() {
	   return name;
   }
   String setName(String name) {
	   this.name=name;
   }
   String geBreed() {
	   return breed;
   }
   String setBreed(String breed) {
	   this.breed=breed;
   }
   void display() {
	   System.out.println("Name : "+name +",Breed :"+breed);
   }
  }
   
public class Dog {
	
	public static void main(String[] args) {
		dogvarities obj2=new dogvarities("Puppy","Labrador");
		dogvarities obj1=new dogvarities("Tommy","Beagle");
		
		obj2.display();
		obj1.display();
		
		obj2.setName("Puppy");
		obj2.setBreed("Labrador");
		obj1.setName("Tommy");
		obj1.setBreed("Beagle");
	}	
	}

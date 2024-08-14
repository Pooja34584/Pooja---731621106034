package com.Pooja;


public class Circle {
 private double radius;

 // Constructor to initialize Circle object
 public Circle(double radius) {
     this.radius = radius;
 }

 // Getter for radius
 public double getRadius() {
     return radius;
 }

 // Setter for radius
 public void setRadius(double radius) {
     this.radius = radius;
 }

 // Method to calculate area
 public double calculateArea() {
     return Math.PI * radius * radius;//pi*r^2
 }

 // Method to calculate circumference
 public double calculateCircumference() {
     return 2 * Math.PI * radius;//2*pi*r
 }

 // Method to display Circle information
 public void displayInfo() {
     System.out.println("Radius: " + radius);
     System.out.println("Area: " + calculateArea());
     System.out.println("Circumference: " + calculateCircumference());
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Create a Circle instance
     Circle circle = new Circle(7.0);

     // Display initial circle information
     System.out.println("Initial Circle Info:");
     circle.displayInfo();

     // Modify radius
     circle.setRadius(10.0);

     // Display updated circle information
     System.out.println("\nUpdated Circle Info:");
     circle.displayInfo();
 }
}


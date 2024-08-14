package com.Pooja;

class rectangle {

    double width;
   double height;

   // Constructor to initialize Rectangle object
   rectangle(double width, double height) {
       this.width = width;
       this.height = height;
   }

   // Getter for width
    double getWidth() {
       return width;
   }

   // Setter for width
    void setWidth(double width) {
       this.width = width;
   }

 
double getHeight() {
       return height;
   }


  void setHeight(double height) {
       this.height = height;
   }

   // Method to calculate area
   double calculateArea() {
       return width * height;
   }

   // Method to calculate perimeter
   double calculatePerimeter() {
       return 2 * (width + height);
   }

   // Method to display Rectangle information
void display() {
       System.out.println("Width: " + width);
       System.out.println("Height: " + height);
       System.out.println("Area: " + calculateArea());
       System.out.println("Perimeter: " + calculatePerimeter());
   }
}

public class Rectangle{

   public static void main(String[] args) {

       rectangle obj = new rectangle(5.0, 3.0);


       System.out.println("Initial rectangle Info:");
       obj.display();


      obj.setWidth(7.0);
       obj.setHeight(4.0);


       System.out.println("\nUpdated rectangle Info:");
       obj.display();
   }
}


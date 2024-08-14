package com.Pooja;


class Shapes {
  double getArea() {
	  return 0;
  }
}


class rect extends Shapes {
 double width;
 double height;


 rect(double width, double height) {
     this.width = width;
     this.height = height;
 }
  double getArea() {
     return width * height;
 }
}

//Main class to test the functionality
public class Shape {
 public static void main(String[] args) {
     rect myRectangle = new rect(5.0, 3.0);
     System.out.println("The area of the rectangle is: " + myRectangle.getArea());
 }
}

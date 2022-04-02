package com.mofirojean;

public class Main {

    public static void main(String[] args) {
	// creating an object of the Rectangle and Square class
       Rectangle r1 = new Rectangle();
       r1.getArea();
       r1.getSide();

       Square s1 = new Square();
       s1.getArea();
       s1.getSide();

    // creating a triangle method
    Triangle t1 = new Triangle(2, 3, 4);

    // call the method of the Triangle
        t1.getArea();
    // calls the method of the polygon
        t1.getPerimeter(2, 3, 4);
    }
}

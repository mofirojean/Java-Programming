package com.mofirojean;

// implements the interface
public class Rectangle implements Polygon{
    @Override
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    // overrides the getSide()

    @Override
    public void getSide() {
        System.out.println("I have 4 sides");
    }
}

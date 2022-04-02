package com.mofirojean;

// implements the interface Polygon
public class Square implements Polygon{
    @Override
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of a square is " + area);
    }
}

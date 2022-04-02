package com.mofirojean;

public interface Polygon {
    // abstract method
    void getArea();

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides){
        int perimeter = 0;
        for (int side: sides){
            perimeter += side;
        }
        System.out.println("Perimeter: " + perimeter);
    }

    // default method
    default void getSide(){
        System.out.println("I can get the side of the polygon");
    }
}

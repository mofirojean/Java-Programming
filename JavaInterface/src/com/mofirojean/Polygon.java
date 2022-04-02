package com.mofirojean;

public interface Polygon {
    void getArea();

    // default method
    default void getSide(){
        System.out.println("I can get the side of the polygon");
    }
}

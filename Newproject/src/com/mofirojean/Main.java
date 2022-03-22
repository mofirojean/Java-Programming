package com.mofirojean;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello ");
        Universe myUniverse = new Universe();
        myUniverse.myFunction();
        Counter myCounter = new Counter();
        myCounter.snapShot();
        myCounter.increment();
        myCounter.snapShot();
        myCounter.setCount(5);
        myCounter.decrement();
        myCounter.snapShot();
        myCounter.increment(4);
        myCounter.snapShot();

    }
}

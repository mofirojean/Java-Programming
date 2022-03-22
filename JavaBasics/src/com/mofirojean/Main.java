package com.mofirojean;

import java.time.DayOfWeek;


public class Main {

    public static void main(String[] args) {

	// write your code here
    String title = "Data structure and Algorithm";
    int index = title.length();
    System.out.println(index);

    // String Building class
    String greeting = "Hello world";
    greeting = "Ciao"; // we changed our mind
    greeting = greeting + '!';
    System.out.println(greeting);

    // calculating the minimum of two number
    double a = 3;
    double b = 4;
    double min = 0;
    String r = "The minimum of the numbers: ";
    min = Math.min(a,b);
    System.out.println(r + a + " and " + b + " is " + min );
    }
}

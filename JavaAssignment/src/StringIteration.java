import java.io.*;
import java.util.*;
import java.text.*;
public class StringIteration {
    // iterating through strings using the following methods
    /**
     * given a string arr of length N,
     * the task is to iterate the string
     * and print all the characters in the given string
     */

    // method 1: native approach
    /**
     * we iterate over the string with range[0, N - 1]
     * using the variable i and print the value of arr[]
     */
    static void iterateString(String arr){
        // Traverse the string
        for (int i = 0; i < arr.length(); i++){
            // print current character
            System.out.print(arr.charAt(i) + " ");
        }
    }

    // method 2: using String.toCharArray()
    /**
     * we convert string into a character array using
     * String.toCharArray() method
     * then you iterate the character using a for loop
     */
    static void iterateString2(String arr){
        char[] ch = arr.toCharArray();
        // traverse the character array
        for (int i = 0; i < ch.length; i++){
            // print the current character
            System.out.print(ch[i] + " ");
        }
    }

    // method 3: Using CharacterIterator
    /**
     *here, we use the CharacterIterator methods current(), to get the character
     * next() to move forward by one position
     * StringCharacterIterator provides the implementation of CharacterIterator
     */
    static void iterateString3(String arr){
        // creating an object of the class java.text.
        CharacterIterator it = new StringCharacterIterator(arr);

        // iterate and print the current character
        while (it.current() != CharacterIterator.DONE){
            System.out.print(it.current() + " ");
            // moving unto the next element in the object
            // using the next() method
            it.next();
        }
    }

    // method 4: Using the StringTokenizer
    /**
     * here we use the StringTokenizer class in java
     * it breaks the strings into tokens based on the delimiter.
     * StringTokenizer(String arr, String delim, boolean flag)
     */
    static void iterateString4(String arr){

        // if returnDelims is true, use the string itself as a delimiter
        StringTokenizer sr = new StringTokenizer(arr, arr, true);

        while (sr.hasMoreTokens()){
            System.out.print(sr.nextToken() + " ");
        }

        // if returnDelims is false, use an empty string as a delimiter
        sr = new StringTokenizer(arr, "", false);
        while (sr.hasMoreTokens()){
            System.out.print(sr.nextToken());
        }

    }

    public static void main(String[] args){
        // custom input string
        String arr ="Mofiro Jean";
        // calling iterateString method
        iterateString(arr);
        iterateString2(arr);
        iterateString3(arr);
        iterateString4(arr);

    }
}

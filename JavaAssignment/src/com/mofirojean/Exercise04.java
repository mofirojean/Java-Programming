package com.mofirojean;

public class Exercise04 {

    public static void main(String[] args) {
	// takes two long values and tell is one id a multiple of the other
        long m = 20000;
        long n = 200;

        // checking the two long values
         isMultiple(m,n);
    }

    public static void isMultiple(long n1, long n2){
        if (n1 % n2 == 0){
            System.out.println(n1 + " Is a of Multiple " + n2);
        } else{
            System.out.println(n1 + " Is not a of Multiple " + n2);
        }
    }


}

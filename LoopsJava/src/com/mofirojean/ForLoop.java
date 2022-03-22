package com.mofirojean;

public class ForLoop {
    public static void main(String[] args){
        /**
         * Syntax for for-loop
         *
         * for (initalizer; booleanExpression; incrementation){
         *      loopBody
         *      }
         */
        // working with for loops
        for (int i = 1; i < 5; i++){
            System.out.println("Iteration: " + i);
        }

        // working with enhanced for loop
        String[] letters = {"A", "B", "C", "D"};
        for (String letter : letters){
            System.out.println(letter);
        }
        System.out.println("next loop");

        // jumping out of a loop using Break and Continue
        for (String letter : letters){
            if (letter.equals("A")){
                continue; // jumps to the next iteration
            }
            System.out.println(letter);
            if (letter.equals("C")){
                break; // Leave the for loop
            }
        }
    }
}

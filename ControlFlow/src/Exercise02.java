public class Exercise02 {
    public static void main(String[] args){
            int maxDistance = 10; //km
            int distanceToHome = 11;

            // condition
        if (distanceToHome > maxDistance){
            System.out.println("The distance from the store to your home is ");
            System.out.println(" more than " + maxDistance + "km away.");
            System.out.println("That is too far for the free delivery");
        }

        if (distanceToHome <= maxDistance){
            System.out.println("Distance from the store to your home is ");
            System.out.println(" within " + maxDistance + "km away");
            System.out.println("You get free delevery");
        }

        // nested if statements
        int speed = 75;
        int maxSpeed = 60;
        int speedForFine = 70;

        if (speed <= maxSpeed){
            System.out.println("speed is less than or equals to the max speed limit");
            if (speed < speedForFine){
                System.out.println("Speed is less than the max. speed limit");
            }
        }else {
            System.out.println("*** You are over the speed limit ***");
        }
        // making it for interesting
        if (speed > maxSpeed){
            System.out.println("Your speed is greater than the max. speed limit");
        } else if (speed < maxSpeed){
            System.out.println("Your speed is less than the max. speed limit");
        } else{
            System.out.println("Your speed is equal to the max. speed limit");
        }
        // if and else statement
        int noDiscount = 0;
        int mediumDiscount = 10; // percent
        int largeDiscount = 15;

        int mediumThreshold = 5; // Kg
        int largeThreshold = 50;

        int purchaseAmount = 40;

        if (purchaseAmount >= largeThreshold){
            System.out.println("You get a discount of " + largeDiscount + "%");
        } else if (purchaseAmount >= mediumThreshold){
            System.out.println("You get a discount of " + mediumDiscount + "%");
        } else{
            //sorry
            System.out.println("You get a discount of " + noDiscount + "%");
        }
        /**
         * Complex conditionals
         * AND && eg a && b
         * OR || eg a || b
         * NOT ! eg !a
         */

        boolean red = true;
        boolean blue = false;

        if ((red) && (blue)){
            System.out.println("Both red and blue are true");
        }
        if (!blue){
            System.out.println("The variable blue is false");
        }
    }
}

public class Exercise06 {
    public static void main(String[] args){
        // comparing strings
        /**
         * you can't use == to compare strings in Java
         * instead use String class's equals method
         * == checks to see if the objects are exactly the same
         */

        String cat = new String("cat");
        String dog = new String("dog");

        if (cat.equals(dog)){
            System.out.println("Cats and Dogs are the same.");
        }

        if (!cat.equals(dog)){
            System.out.println("Cats and Dogs are not the same.");
        }

        if (dog.equals(dog)){
            System.out.println("Dogs are dogs.");
        }

        // using literal strings
        if (dog.equals("dog")){
            System.out.println("Dogs are dogs.");
        }
        // compare using a literal string, too
        if ("dog".equals(dog)){
            System.out.println("Dogs are dogs");
        }

    }
}

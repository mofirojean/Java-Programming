public class Exercise04 {
    public static void main(String[] args){
        // Arithmetic operation in an if statement
        int x = 2;
        int y = 1;

        if ((x + y) < 5){
            System.out.println("X addded to Y is less than 5.");
        }

        // ternary operator
        int height = 200;
        int minHeight = 121;
        String result;

        result = (height > minHeight) ? "You are allowed on the ride" : "Sorry you do not meet the height requirement";

        System.out.println(result);
    }
}

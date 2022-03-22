public class Exercise05 {
    public static void main(String[] args){
        // Equality in floats and doubles
        double a = .6 + .6 + .6 + .6 + .6 + .6;
        double b = .6 * 6;

        System.out.println("A is " + a);
        System.out.println("B is " + b);

        if (a != b){
            System.out.println("A is not equal to B.");
        }

        // Check if close enough
        // the Math.abs() method returns the absolute value of the input
        if (Math.abs(a - b) < .001){
            System.out.println("A is close enough to B.");
        }
    }
}

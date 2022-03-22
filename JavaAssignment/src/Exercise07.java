public class Exercise07 {
    // Exercise R - 1.7
    /**
     * The Java program takes integer n and
     * return the square of all positive integer <= n
     */
    public static void main(String[] args){
        // initialising the value of n
        int n = 4;
        int total = 0;

        // iterate to obtain the squares of the positive integer
        for (int i = 0; i <= n; i++){
            total += (i*i);
        }
        // print out the result
        System.out.println(total);
    }
}

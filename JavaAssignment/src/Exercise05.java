public class Exercise05 {
    // Exercise R-1.5
    /**
     * Java method that takes an integer n
     * and returns the sum of all positive integer <= n
     */
    public static void main(String[] args){
        // create a variable with int type and another to hold the total
        int n = 4;
        int total = 0;

        // using a for loop to perform the calculation
         for (int i = 1; i <= n; i++){
             total += i;
         }

         // print the sum
        System.out.println(total);
    }
}

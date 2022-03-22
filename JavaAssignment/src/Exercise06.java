public class Exercise06 {
    // Exercise R-1.6
    /**
     * The Java program takes an integer n and
     * returns the sum of its odd positive integers <= n
     */
    public static void main(String[] args){
        int n = 10;
        int total = 0;

        // using a for loop to iterate and get the odd numbers
        for (int i = 1; i <= n; i++){
            if (i % 2 == 1){
                total += i;
            } else{
                continue;
            }
        }

        // print total
        System.out.println(total);
    }
}

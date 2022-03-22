public class Exercise03 {
    // exercise R-1.4
    /**
     * checking is a number is even without using
     * modulus, multiplication, or division operators
     */
    // using the bitwise AND operator
    static boolean isEven(int n){
        /** using the bitwise method
         * (odd number) & 1 is 1
         * (even number) & 1 is 0
         */
        //  if (n & 1) is 1, then it's odd else its even
        return ((n & 1) != 1);
    }
    public static void main(String[] args){
        int num = 10;
        if (isEven(num) == true){
            System.out.println("true it's Even ");
        } else{
            System.out.println("false it's Odd");
        }
    }
}

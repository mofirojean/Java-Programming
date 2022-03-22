public class Fibo {
    // Creating a class to display the Fabonacci series of given number
    public static void main(String[] args){
        // write a Fabonacci series
        fib(100);
    }

    static void fib(int n){
        // writes a fabonacci series
        int a = 0, b = 1;
        while (a < n){
            System.out.print(a + " ");
            a = b;
            b = a+b;
        }
        System.out.println();
    }

    static void fib2(int n){
        // returns a fabonacci series
        int[] results = {};
        int a = 0, b = 0;
        while (a < n){

        }
    }
}

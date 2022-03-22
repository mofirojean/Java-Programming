public class Addition {
    // creating the method add
    public static void main(String[] args){
        int a = 19;
        int b = 5;

        // calling the method
        int c = add(a,b); // a and b are actual parameters
        System.out.println(c);
    }

    public static int add(int n1, int n2){ // n1, n2 are formal parameters
        int plus;
        plus = n1 + n2;
        return plus; // returning the sum
    }

}

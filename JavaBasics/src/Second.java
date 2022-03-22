import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        // Accessing the Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        // reading the value from the user
        int num = input.nextInt();

        findEvenOdd(num);

    }

    public static void findEvenOdd(int num){ // method header
        // method body
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }
    }
}

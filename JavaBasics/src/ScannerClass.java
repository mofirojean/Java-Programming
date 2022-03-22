import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        // create a scanner object
        Scanner input =  new Scanner(System.in);

        System.out.println("enter an Integer: ");
        // reads an int value
        int data1 = input.nextInt();

        System.out.println("Using nextInt(): " + data1);

        // reading a double value
        System.out.print("Enter Double value: ");

        // read double value
        double data2 = input.nextDouble();
        System.out.println("Using nextDouble(): " + data2);

        // reading a word
        System.out.print("Enter your name: ");

        // reads the entire word
        String value = input.next();
        System.out.println("Using the next(): " + value);

        // close the scanner class
        input.close();
    }
}

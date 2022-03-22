public class Exercise01 {
    public static void main(String[] args){
        // converting command line arguments
        // converting strings into integers and doubles
        if (args.length > 0){
            int intValue = Integer.parseInt(args[0]);
            System.out.println(intValue);
        }
        // converting into double
        if (args.length > 1){
            double doubleValue = Double.parseDouble(args[1]);
            System.out.println(doubleValue);
        }
    }
}

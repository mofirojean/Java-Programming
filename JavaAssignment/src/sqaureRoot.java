public class sqaureRoot {
    static double squareRoot(int n){

        int x = n;
        int y = 1;
        double e = 0.000001;
        while(x-y> 0){
            if (x < 0){
                System.err.println("Invalid Input!");
            }
            else{
                x = (x + y)/2;
                y = n / x;
            }
        }
        return x;
    }
    public static void main(String[] args){
        int n = -16;
        System.out.println(squareRoot(n));
    }
}

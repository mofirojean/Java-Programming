public class WhileLoop {
    public static  void main(String[] args){
        // working with while loops
        /**
         * while loops repeats while a boolean expression is true
         * Syntax:
         * initialisation variable
         * while (booleanExpression){
         *      Execute these statements
         *      incrementation
         * }
         */
        int i = 1;
        while (i < 10){
            System.out.println("Odd: " + i);
            i += 2;
        }
    }
}

public class DoWhileLoop {
    public static void main(String[] args){
        // working with do-while loops
        /*
         * it checks the conditions after executing the code
         * Syntax:
         * do {
         *      // Execute these statements....
         * } while (boolean expression);
         * ypu can also use break and continue statements too
         */
        int i = 2;
        do {
            System.out.println("Even: " + i);
            i +=2;
        } while (i < 10);
    }
}

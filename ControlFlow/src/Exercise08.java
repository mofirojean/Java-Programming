public class Exercise08 {
    public static void main(String[] args){
        // allowing case to fall through
        int tempAdjustment = 0;
        String taste = "way too hot";

        switch (taste){
            case "too cold" : tempAdjustment += 1;
                break;
            case "way too hot" : tempAdjustment -= 1;
            case "too hot" : tempAdjustment -= 1;
                break;
            case "just right": // no adjustment
            default:
                break;
        }
        // advance switch statements

        System.out.println("Adjust temerature: " + tempAdjustment );
    }
}

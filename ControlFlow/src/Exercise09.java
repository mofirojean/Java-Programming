public class Exercise09 {
    public static void main(String[] args){
        // advanced switch statements
//        int tempAdjustment = 0;
        String taste = "way too hot";
        int tempAdjustment = switch(taste){
            case "too cold" -> 1;
            case "way too hot" -> -2;
            case "too hot" -> -1;
            case "just right" -> 0;
            default -> 0;
        };
        System.out.println("Adjust temperature: " + tempAdjustment );

    }
}

public class Exercise07 {
    public static void main(String[] args){
        int season = 3;
        String message;

        // using the switch statements
        switch (season){
            case 1: message = "Spring";
                break;
            case 2: message = "Summer";
                break;
            case 3: message = "Fall";
                break;
            case 4: message = "Winter";
                break;
            default: message = "That's not a season";
                break;

        }

        System.out.println(message);

    }
}

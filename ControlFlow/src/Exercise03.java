public class Exercise03 {
    public static void main(String[] args){
        // creating complex operators by using logic operators
        int age = 60;
        int bpm = 150;

        // checking the heart rate of a 30 year old patient
        if (age == 30){
            if ((bpm >= 60) && (bpm <= 136)){
                System.out.println("Heart rate is normal.");
            } else if (bpm < 95){
                System.out.println("heart rate is very low.");
            } else{
                System.out.println("Heart rate is very high.");
            }
        } else if (age == 60){
            if ((bpm >= 60) && (bpm <= 136)){
                System.out.println("Heart rate is normal.");
            } else if (bpm < 95){
                System.out.println("heart rate is very low.");
            } else{
                System.out.println("Heart rate is very high.");
            }
        }
    }
}

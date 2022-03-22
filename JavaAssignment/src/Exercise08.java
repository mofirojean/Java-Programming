import java.util.Locale;

public class Exercise08 {
    // Exercise R-1.8
    // the java program counts the number of vowel sound in a word
    /**
     * A java method the counts the number of vowels
     * in a given character string
     */
    public static void main(String[] args){
        String line = "hello world 3223 nigerian school";
        int vowels = 0, consonants = 0, digits = 0, space = 0; // initializing the value of the vowel

        // creating a loop to iterate through the text
        line = line.toLowerCase(); // convert the text to lower case
        for (int i = 0; i < line.length(); ++i){
            char ch = line.charAt(i);  // converts the string into a character type

            // using an if condition to select the vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            // check if character is between a to z
            else if (ch >= 'a' && ch <= 'z'){
                consonants++;
            }
            // check if character is between 0 to 9
            else if (ch >= '0' && ch <= '9'){
                digits++;
            }
            // check if the character is a space
            else if (ch == ' '){
                space++;
            }
        }
        // print number of vowels
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + space);

    }
}

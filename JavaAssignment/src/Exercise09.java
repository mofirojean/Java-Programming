// Java program to remove punctuation from a given string
public class Exercise09 {
    // Exercise R - 1.9

    // using the replaceAll() method
    /**
     * using the regular expression pattern in
     * the replaceAll() method with the pattern \\p{Punct}
     * to remove the punctuation
     */
    public static void main(String[] args){
        // contains the string with punctuations
        String sentence = "Let's try, Mike!";

        System.out.println(sentence);
        String result = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(result);
    }
}

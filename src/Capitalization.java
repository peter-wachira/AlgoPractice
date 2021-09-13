import java.io.OutputStream;

public class Capitalization {
    public static void main(String[] args) {

        System.out.println(reverseString("Tac"));
        reverseString("Tac");

    }

    public static boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        return count == word.length() || count == 0 || count == 1 && Character.isUpperCase(word.charAt(0));

    }


    public static String reverseString(String word){
        StringBuilder tempString = new StringBuilder();
        for(int i = word.length()-1; i >= 0 ;i--){
            tempString.append(word.charAt(i));
        }

        return tempString.toString();
    }


}

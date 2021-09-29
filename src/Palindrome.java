public class Palindrome {

    // check whether a string is a palindrome java
    public static void main(String[] args) {
        isPalindrome("level");
    }
    public static   boolean isPalindrome(String s ){

        int i = 0;
        int j = s.length()- 1;

        while (i < j) {
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
                j--;
            }
            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))){
                System.out.println("false");
                return false;
            }

        }
        System.out.println("true");
        return true;
    }

}

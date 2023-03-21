package playground;

public class ReverseString {


    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String result = reverse2("Cat”, return “taC");
        System.out.println(result);
    }


    public static String reverse2 (String s ){
        char[] characters = new char[s.length()];
        int j =0;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters[j++] = s.charAt(i);
            System.out.println(s.charAt(i));
        }

        return new String(characters);
    }
}

package kunalkunshawa.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        // Search item index
        int[] numbersArr = {1, 32, 33, 43, 35, 6, 7, 84, 9, 0, 7, 4, 2, 3, 4, 23, 4, 3, 2, 3, 23};
        int target = 45;
        int answer = linearSearchInInt(numbersArr, target);
        System.out.println(answer);


        String name = "Peter";
        char strTarget = 'i';
        System.out.println(searchInString(name, strTarget));

    }

    static int linearSearchInInt(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            //return index of item
            if (element == target) {
                return index;
            }
        }
        return -1;
    }


    static boolean searchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            int element = str.charAt(i);
            if (element == target) {
                return true;
            }
        }
        return false;
    }


}

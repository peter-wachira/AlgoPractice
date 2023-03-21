package kunalkunshawa.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        //Search for 35 in range 3 - 8
        int[] arr = {12, 1, 32, -324, 35, -5, 35, 45, 34, 345};
        System.out.println(searchNumberIndex(arr, 35, 3, 8));

        //Search for minimum no in arr
        System.out.println(searchForMinimumNumber(arr));
    }


    static int searchNumberIndex(int[] array, int target, int startIndex, int endIndex) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = startIndex; index < endIndex; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    //Find minimum element in the array [18,12,-7,3,14,28]
    // assume arr.length != 0
    static int searchForMinimumNumber(int[] arr) {
        int answer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentIndex = arr[i];
            if (currentIndex > answer) {
                answer = currentIndex;
            }
        }
        return answer;
    }


}

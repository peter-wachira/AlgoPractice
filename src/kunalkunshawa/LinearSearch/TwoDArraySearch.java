package kunalkunshawa.LinearSearch;

import java.util.Arrays;

public class TwoDArraySearch {


    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 34;
        int[] ans = search2DArr(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }


    static int[] search2DArr(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int highest_value = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                int current_value = ints[col];
                if (current_value > highest_value) {
                    highest_value = current_value;
                }
            }
        }
        return highest_value;
    }
}

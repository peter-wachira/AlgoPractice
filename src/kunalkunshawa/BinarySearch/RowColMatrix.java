package kunalkunshawa.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 2)));
    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}

package kunalkunshawa.arrays;

public class MultiDimensionArray {

    int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
    };

    public static void main(String[] args) {
        MultiDimensionArray multiDimensionArray = new MultiDimensionArray();
        multiDimensionArray.print2DArray();
    }

    public void print2DArray() {
        /*
         Printing a simple Array
           {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
           };
        */

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}

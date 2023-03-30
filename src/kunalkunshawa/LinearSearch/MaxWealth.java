package kunalkunshawa.LinearSearch;

public class MaxWealth {
    // https://leetcode.com/problems/richest-customer-wealth/

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 13}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        //  account = col
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int[] ints = accounts[i];
            int rowSum = 0;
            for (int account = 0; account < ints.length; account++) {
                int current = ints[account];
                rowSum = rowSum + current;
            }
            if (max < rowSum) {
                max = rowSum;
            }
        }
        return max;
    }


    /*Kotlin Version
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = Integer.MIN_VALUE
        for (person in accounts.indices) {
            val rowSum = accounts[person].sum()
            if (max < rowSum) {
                max = rowSum
            }
        }
        return max
    }*/

}

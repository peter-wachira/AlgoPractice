package kunalkunshawa.BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'b', 'c', 'd', 'e', 'f', 'j'};
        char target = 'e';
        char answer = nextGreatestLetter(letters, target);
        System.out.println(answer);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}

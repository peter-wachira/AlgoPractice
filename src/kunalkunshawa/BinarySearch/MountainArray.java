package kunalkunshawa.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/

    /*This algorithm is used to find the peak element in a given "mountain array", which is an array that starts with an increasing sequence of integers and then reaches a peak element, after which the sequence of integers starts decreasing.

    The algorithm works by using a binary search approach, which is a way of finding a specific element in a sorted array by repeatedly dividing the search interval in half. Initially, the start and end indices of the array are set to the first and last indices of the array, respectively.

    The algorithm then repeatedly checks the middle element of the current search interval (start to end) to determine if it is part of the increasing or decreasing sequence. If it is part of the decreasing sequence, the peak element must be to the left of the current element, so the search interval is updated to be the left half of the current interval. Otherwise, the peak element must be to the right of the current element, so the search interval is updated to be the right half of the current interval.

    This process continues until the start and end indices point to the same element, which is the peak element of the mountain array. The algorithm returns this index as the output.

    Overall, this algorithm is a clever application of binary search to efficiently find the peak element of a mountain array.
    */
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

}
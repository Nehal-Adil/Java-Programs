/*
                                    34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

 */

package LeetCode;

public class BinarySearch_34 {
    static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }

    static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    static int[] searchRange(int[] num, int target) {
        int first = firstOccurrence(num, target);
        if (first == -1) return new int[]{-1, -1};
        int last = lastOccurrence(num, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] case1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int ans1[] = searchRange(case1, target1);
        System.out.println("The first and last position: " + ans1[0] + " " + ans1[1]);

        int[] case2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int ans2[] = searchRange(case2, target2);
        System.out.println("The first and last position: " + ans2[0] + " " + ans2[1]);

        int[] case3 = {};
        int target3 = 0;
        int ans3[] = searchRange(case3, target3);
        System.out.println("The first and last position: " + ans3[0] + " " + ans3[1]);
    }
}

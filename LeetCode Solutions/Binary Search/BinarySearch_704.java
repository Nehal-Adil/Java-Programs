/*
                                                            704. Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

Constraints:
1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.

 */

package LeetCode;

public class BinarySearch_704 {

    static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high--;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] case1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int ans1 = search(case1, target1);
        System.out.println("The target exists in this index: " + ans1);

        int[] case2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int ans2 = search(case2, target2);
        System.out.println("The target exists in this index: " + ans2);
    }
}

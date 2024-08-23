/*

                                                                    35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

 */

package LeetCode;

public class BinarySearch_35 {
    static int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int ans = n;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] case1 = {1, 3, 5, 6};
        int target1 = 5;
        int ans1 = searchInsert(case1, target1);
        System.out.println("The target exists in this index: " + ans1);

        int[] case2 = {1, 3, 5, 6};
        int target2 = 2;
        int ans2 = searchInsert(case2, target2);
        System.out.println("The target exists in this index: " + ans2);

        int[] case3 = {1, 3, 5, 6};
        int target3 = 7;
        int ans3 = searchInsert(case3, target3);
        System.out.println("The target exists in this index: " + ans3);
    }
}

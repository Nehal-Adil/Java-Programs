/*
                                            189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

 */

package LeetCode;

public class Arrays_189 {

    // Solution 1: Time Complexity: O(N), Space Complexity: O(k)
    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        int[] temp = new int[k];

        // fill the temp array
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        // rotate the elements in arr
        for (int i = n - k; i < n; i++) {
            arr[i] = arr[i - n + k];
        }

        // copy the elements from temp array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // Solution 2: Time Complexity: O(N), Space Complexity: O(1)
    static void rotate(int[] arr, int k) {
        int n = arr.length;

        if (n == 0) return;

        k = k % n;
        if (k > n) return;

        reverse(arr, n - k, n - 1);

        reverse(arr, 0, n - k - 1);

        reverse(arr, 0, n - 1);
    }

    // Reverse function
    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(case1, k1);
        for (int i : case1) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] case2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(case2, k2);
        for (int i : case2) {
            System.out.print(i + " ");
        }
    }
}

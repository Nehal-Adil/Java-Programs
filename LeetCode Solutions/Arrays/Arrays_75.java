/*
                                                          75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2

 */

package LeetCode;

public class Arrays_75 {

    static void sortColors01(int[] arr) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        for (int i = 0; i < cnt0; i++) arr[i] = 0;

        for (int i = cnt0; i < cnt0 + cnt1; i++) arr[i] = 1;

        for (int i = cnt0 + cnt1; i < arr.length; i++) arr[i] = 2;

    }

    // Dutch National flag algorithm
    static void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                //swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] case1 = {2, 0, 2, 1, 1, 0};
        sortColors(case1);
        for (int j : case1) {
            System.out.print(j + " ");
        }

        System.out.println();

        int[] case2 = {2, 0, 1};
        sortColors(case2);
        for (int j : case2) {
            System.out.print(j + " ");
        }
    }
}

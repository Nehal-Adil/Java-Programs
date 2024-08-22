/*
                                            136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

 */

package LeetCode;

public class Arrays_136 {

    // Brute Force Approach
    static int singleNumber01(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) return num;
        }
        return -1;
    }

    // Better Approach
    static int singleNumber02(int[] arr) {
        int n = arr.length;

        // find the max element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // hash the given array
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // find the single element
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;

    }

    // Optimal Approach
    static int singleNumber(int[] arr) {
        int n = arr.length;

        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int case1[] = {2, 2, 1};
        int ans1 = singleNumber(case1);
        System.out.println("The single element is: " + ans1);

        int case2[] = {4, 1, 2, 1, 2};
        int ans2 = singleNumber(case2);
        System.out.println("The single element is: " + ans2);

        int case3[] = {1};
        int ans3 = singleNumber(case3);
        System.out.println("The single element is: " + ans3);
    }
}

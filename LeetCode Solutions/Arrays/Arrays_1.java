/*
                                                1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9

 */

package LeetCode;

import java.util.*;

public class Arrays_1 {

    // Brute Force Approach  Time Complexity: O(N^2)
    static int[] twoSum01(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }

    static int[] twoSum02(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)) {
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            map.put(arr[i], i);
        }
        return ans;
    }

    static int[] twoSum(int[] arr, int target) {

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                ans[0] = arr[left];
                ans[1] = arr[right];
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int case1[] = {2, 7, 11, 15};
        int target1 = 9;
        int[] ans1 = twoSum(case1, target1);
        System.out.println("The answer: [" + ans1[0] + ", "
                + ans1[1] + "]");

        int case2[] = {3, 2, 4};
        int target2 = 6;
        int[] ans2 = twoSum(case2, target2);
        System.out.println("The answer: [" + ans2[0] + ", "
                + ans2[1] + "]");

        int case3[] = {2, 6, 5, 8, 11};
        int target3 = 15;
        int[] ans3 = twoSum(case3, target3);
        System.out.println("The answer: [" + ans3[0] + ", "
                + ans3[1] + "]");


    }
}

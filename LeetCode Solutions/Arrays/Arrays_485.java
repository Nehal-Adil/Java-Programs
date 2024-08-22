/*
                                            485. Max Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.

 */

package LeetCode;

public class Arrays_485 {

    static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0, maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
        }
        maxi = Math.max(maxi, count);
        return maxi;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}

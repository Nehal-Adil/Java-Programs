/*
                                                        169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 10^4
-10^9 <= nums[i] <= 10^9

 */

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Arrays_169 {

    // Brute Force Approach
    static int majorityElement01(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2))
                return arr[i];
        }
        return -1;
    }

    // Better Approach
    static int majorityElement02(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            int value = map.getOrDefault(j, 0);
            map.put(j, value + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;

    }

    // Optimal Approach - Moore's Voting Algorithm
    static int majorityElement(int[] arr) {
        int n = arr.length;

        // apply the algorithm to store an element
        int cnt = 0, element = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        //check if the stored algorithm is the majority element
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (element == arr[i]) {
                cnt1++;
            }
        }

        if (cnt1 > n / 2) return element;

        return -1;
    }

    public static void main(String[] args) {
        int[] cas1 = {3, 2, 3};
        int ans1 = majorityElement(cas1);
        System.out.println("The majority element is: " + ans1);

        int[] cas2 = {2, 2, 1, 1, 1, 2, 2};
        int ans2 = majorityElement(cas2);
        System.out.println("The majority element is: " + ans2);

    }
}

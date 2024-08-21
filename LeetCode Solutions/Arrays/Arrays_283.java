/*
                                                    283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

 */

package LeetCode;

import java.util.ArrayList;

public class Arrays_283 {
    // Brute Force
    static void moveZeroes01(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
    }

    // Optimal Solution
    static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = -1;

        // place j pointer
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                //swap arr[i] to arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
    }

    public static void main(String[] args) {
        int[] case1 = {0, 1, 0, 3, 12};
        moveZeroes(case1);
        for (int j : case1) {
            System.out.print(j + " ");
        }

        System.out.println();

        int[] case2 = {1, 0, 4, 5, 2, 0, 0, 7, 0, 0, 6, 0};
        moveZeroes(case2);
        for (int j : case2) {
            System.out.print(j + " ");
        }
    }
}

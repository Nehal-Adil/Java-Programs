/*
                                                    Second Largest in array

You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

Input format :
The first line contains an integer 'N' representing the size of the array/list.
The second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
Return the second largest element in the array/list.

Sample Input 1:
5
4 3 10 9 2
Sample Output 1:
9

Sample Input 2:
7
13 6 31 14 29 44 3
Sample Output 2:
31

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        int secondMax = Integer.MIN_VALUE;

        if (arr.length == 0) {
            return secondMax;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        int ans = SecondLargest.findSecondLargest(arr);
        System.out.println(ans);
    }
}

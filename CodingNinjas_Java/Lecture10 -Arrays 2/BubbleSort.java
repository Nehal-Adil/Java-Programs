/*
                                    Code Bubble Sort

You are given an integer array 'arr' of size 'N'.
You must sort this array using 'Bubble Sort'.

Note:
Change in the input array itself. You don't need to return or print the elements.

Example:
Input: ‘N’ = 7
'arr' = [2, 13, 4, 1, 3, 6, 28]
Output: [1 2 3 4 6 13 28]
Explanation: After applying bubble sort on the input array, the output is [1 2 3 4 6 13 28].

Input format :
The first line contains an integer 'N' representing the size of the array.
The second line contains 'N' single space-separated integers representing the elements of the array.
Output format :
The output contains the array elements after the sorting.

Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying bubble sort on the input array, the output is [1 2 3 4 6 13 28].

Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying bubble sort on the input array, the output is [0 2 3 6 9].

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class BubbleSort {

    public static void bubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort.bubble(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

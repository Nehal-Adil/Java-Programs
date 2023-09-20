/*
                                        Code Insertion Sort

You are given an integer array 'arr' of size 'N'.
You must sort this array using 'Insertion Sort' recursively.

 Note:
Change in the input array itself. You don't need to return or print the elements.

Example:
Input: ‘N’ = 7
'arr' = [2, 13, 4, 1, 3, 6, 28]
Output: [1 2 3 4 6 13 28]
Explanation: After applying insertion sort on the input array, the output is [1 2 3 4 6 13 28].

Input format :
The first line contains an integer 'N' representing the size of the array.
The second line contains 'N' single space-separated integers representing the elements of the array.
Output Format :
Print the array elements in sorted order, separated by a single space.

Sample Input 1:
5
9 3 6 2 0
Sample Output 1:
0 2 3 6 9

Sample Input 2:
4
4 3 2 1
Sample Output 2:
1 2 3 4

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class InsertionSort {

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();

        insertion(arr);
        printArray(arr);

    }

    // Function to take values of Array
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // To print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

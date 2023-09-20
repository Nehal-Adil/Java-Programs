/*
                                                Selection Sort

Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

Note:
Change in the input array/list itself.

Example:
Input:
N = 5
arr = {8, 6, 2, 5, 1}
Output:
1 2 5 6 8

Input format :
First line contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Output format :
The output contains the integers of the sorted array, separated by a single space.
Note:-
You don’t need to print anything. Just implement the given function.

Sample Input 1:
6
2 13 4 1 3 6
Sample Output 1:
1 2 3 4 6 13
Explanation Of Sample Input 1:
 Select 1 and swap with element at index 0. arr= {1,13,4,2,3,6}

 Select 2 and swap with element at index 1. arr= {1,2,4,13,3,6}

 Select 3 and swap with element at index 2. arr= {1,2,3,13,4,6}

 Select 4 and swap with element at index 3. arr= {1,2,3,4,13,6}

 Select 6 and swap with element at index 4. arr= {1,2,3,4,6,13}

Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9

Constraints :
1 <= N <= 10^3
0 <= arr[i] <= 10^5
Time Limit: 1 sec

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class SelectionSort {

    public static void selection(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();

        selection(arr);
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

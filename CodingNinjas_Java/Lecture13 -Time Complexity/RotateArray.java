/*
                                                    Rotate array

You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

Note:
Change in the input array/list itself. You don't need to return or print the elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains the value of 'D' by which the array/list needs to be rotated.
Output Format :
For each test case, print the rotated array/list in a row separated by a single space.
Output for every test case will be printed in a separate line.

Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2

Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[] arr, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0, j = 0; i < arr.length && j < d; i++) {
            if (i < arr.length - d) {
                arr[i] = arr[i + d];
            } else {
                arr[i] = temp[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sr.nextInt();
            }
            int d = sr.nextInt();
            RotateArray.rotate(ar, d);
            for (int i = 0; i < n; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
            t = t - 1;
        }
    }
}

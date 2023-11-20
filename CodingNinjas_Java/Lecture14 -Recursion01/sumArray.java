/*
Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26

Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class sumArray {
    public static int sum(int arr[]) {
        return sum(arr, 0, arr.length-1);
    }

    public static int sum(int arr[], int start, int end) {
        if(start > end) {
            return 0;
        }
        int output = sum(arr, start+1, end);
        return arr[start]+output;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sumArray.sum(input));
    }
}

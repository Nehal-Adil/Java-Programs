/*
                                                            Find Leaders in Array
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader,
if all the elements following it (i.e. present at its right) are less than or equal to A[i].

Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^6

Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
-1 0 2 34
Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
6 17

*/

package Test3;

import java.util.Scanner;

public class FindLeaders_arr {
    public static void leaders(int[] input) {

        int max = Integer.MIN_VALUE;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] >= max) {
                System.out.print(input[i] + " ");
                max = input[i];
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        leaders(input);
    }
}

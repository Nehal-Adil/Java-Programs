/*
                                                            Print Like a Wave

For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the
first column top to bottom, next column bottom to top and so on.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.

Output format :
For each test case, print the elements of the two-dimensional array/list in the sine wave order in a single line, separated by a single space.
Output for every test case will be printed in a seperate line.

Sample Input 1:
1
3 4
1  2  3  4
5  6  7  8
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4

Sample Input 2:
2
5 3
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
3 3
10 20 30
40 50 60
70 80 90
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15
10 40 70 80 50 20 30 60 90

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class WavePrint {

    public static void printWave(int[][] arr) {
        int nRows = arr.length;
        if (nRows == 0) {
            return;
        }

        int mCols = arr[0].length;

        for (int j = 0; j < mCols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < nRows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = nRows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            M = sr.nextInt();
            int[][] ar = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            WavePrint.printWave(ar);
            System.out.println();
        }
    }
}

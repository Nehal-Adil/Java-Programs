/*
                                                                Print Spiral

For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
Mind that every element will be printed only once.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.

Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.
Output for every test case will be printed in a separate line.

Sample Input 1:
1
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Sample Input 2:
2
3 3
1 2 3
4 5 6
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5
10 20 30

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class SpiralPrint {
    public static void spiralPrint(int[][] mat) {
        int nRows = mat.length;
        if (nRows == 0) {
            return;
        }

        int mCols = mat[0].length;

        int i, rowStart = 0, colStart = 0;

        int numElements = nRows * mCols, count = 0;

        while (count < numElements) {
            for (i = colStart; count < numElements && i < mCols; ++i) {
                System.out.print(mat[rowStart][i] + " ");
                count++;
            }
            rowStart++;
            for (i = rowStart; count < numElements && i < nRows; ++i) {
                System.out.print(mat[i][mCols - 1] + " ");
                count++;
            }
            mCols--;
            for (i = mCols - 1; count < numElements && i >= colStart; --i) {
                System.out.print(mat[nRows - 1][i] + " ");
                count++;
            }
            nRows--;
            for (i = nRows - 1; count < numElements && i >= rowStart; --i) {
                System.out.print(mat[i][colStart] + " ");
                count++;
            }
            colStart++;
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
            SpiralPrint.spiralPrint(ar);
            System.out.println();
        }
    }
}

/*
                                                    Largest Row or Column

For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column)
amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum,
consider the ith row as answer.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively,
for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.

Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.
Output for every test case will be printed in a seperate line.

Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.

Sample Input 1:
1
3 2
6 9
8 5
9 2
Sample Output 1:
column 0 23

Sample Input 2:
1
4 4
6 9 8 5
9 2 4 1
8 3 9 3
8 7 8 6
Sample Output 2:
column 0 31

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class LargestRowOrCol {
    public static void findLargest(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        // For Rows
        int maxRowSum = Integer.MIN_VALUE;
        int maxRow = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            if (maxRowSum < sum) {
                maxRowSum = sum;
                maxRow = i;
            }
        }

        //For Columns
        int maxColSum = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            if (maxColSum < sum) {
                maxColSum = sum;
                maxCol = i;
            }
        }

        if (maxRowSum > maxColSum) {
            System.out.println("row " + maxRow + " " + maxRowSum);
        } else {
            System.out.println("column " + maxCol + " " + maxColSum);
        }

    }

    public static void main(String[] args) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int[][] ar = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            LargestRowOrCol.findLargest(ar);
        }
    }
}

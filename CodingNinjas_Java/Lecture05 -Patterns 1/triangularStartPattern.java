/*
               Code : Triangular Star Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****

Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class triangularStartPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

/*
        Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4
...*
..***
.*****
*******
The dots represent spaces.

Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
   *
  ***
 *****

Sample Input 2 :
4
Sample Output 2 :
    *
   ***
  *****
 *******

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        while (i <= N) {
            int spaces = 1;
            while (spaces <= N - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            int starDec = i - 1;
            while (starDec >= 1) {
                System.out.print("*");
                starDec--;
            }
            System.out.println();
            i++;
        }
    }
}

/*
        Code : Triangle of Numbers
Print the following pattern for the given number of rows.
Pattern for N = 4
...1
..232
.34543
45676543
The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
     1
    232
   34543
 45676543
5678987654

Sample Input 2:
4
Sample Output 2:
   1
  232
 34543
4567654
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class triangleOfNumbers {
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
            int p = i;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }
            int dec = 2 * i - 2;
            while (dec >= i) {
                System.out.print(dec);
                dec = dec - 1;
            }
            System.out.println();
            i++;
        }
    }
}

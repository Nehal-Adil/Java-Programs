/*
              Code : Mirror Image Number Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
3
Sample Output 1:
  1
 12
123

Sample Input 2:
4
Sample Output 2:
   1
  12
 123
1234
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class mirrorImageNumPattern {
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
            int p = 1;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

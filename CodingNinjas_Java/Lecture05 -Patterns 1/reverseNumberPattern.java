/*
              Code : Reverse Number Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321

Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class reverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int p = i;
            int j = 1;
            while (j <= i) {
                System.out.print(p);
                p = p - 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

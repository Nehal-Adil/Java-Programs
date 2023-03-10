/*
                Code : Interesting Alphabets
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26

Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH

Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class interestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 1;
            char p = (char) ('A' + N - i);
            while (j <= i) {
                System.out.print(p);
                p = (char) (p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

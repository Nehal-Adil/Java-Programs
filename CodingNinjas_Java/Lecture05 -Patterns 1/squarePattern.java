/*
                    Square Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777

Sample Input 2:
6
Sample Output 2:
666666
666666
666666
666666
666666
666666
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j <= N) {
                System.out.print(N);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

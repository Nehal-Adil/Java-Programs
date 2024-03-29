/*
Given is the code to print numbers from 1 to n in increasing order recursively.

Input Format :
Integer n

Output Format :
Numbers from 1 to n (separated by space)

Constraints :
1 <= n <= 10000

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6

Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
 */

package recursionPrograms;

import java.util.Scanner;

public class printNum {
    public static void printN_Num(int n) {
        if(n==1) {
            System.out.print(n + " ");
            return;
        }

        printN_Num(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printN_Num(n);
    }
}

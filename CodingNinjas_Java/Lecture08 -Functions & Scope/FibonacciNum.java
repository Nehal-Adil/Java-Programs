/*
                                            Fibonacci Number

Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1

Input Format :
Integer N
Output Format :
true or false

Constraints :
0 <= n <= 10^4

Sample Input 1 :
5
Sample Output 1 :
true

Sample Input 2 :
14
Sample Output 2 :
false
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class FibonacciNum {
    public static boolean checkFibo(int num) {
        int n1 = 0;
        int n2 = 1;
        while (n1 < num) {
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
        if (num == n1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkFibo(num));
    }
}

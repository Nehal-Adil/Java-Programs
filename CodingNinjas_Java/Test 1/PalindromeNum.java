/*
                                    Palindrome number

Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121

Sample Input 1 :
121
Sample Output 1 :
true

Sample Input 2 :
1032
Sample Output 2 :
false

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rem, rev = 0, temp;
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
//         System.out.print(rev);

        if (rev == temp) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}

/*
Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
 */

package PS_Sprint_1;

import java.util.Scanner;

public class Prime_02 {

    private static void check_Prime(int num) {
        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();
        check_Prime(num);
    }
}

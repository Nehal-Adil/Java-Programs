/*
                           Binary to decimal
Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9

Sample Input 1 :
1100
Sample Output 1 :
12

Sample Input 2 :
111
Sample Output 2 :
7
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int decimal = 0, weight = 1, rem;

        while (N != 0) {
            rem = N % 10;
            decimal = decimal + rem * weight;
            N = N / 10;
            weight = weight * 2;
        }
        System.out.println(decimal);
    }
}

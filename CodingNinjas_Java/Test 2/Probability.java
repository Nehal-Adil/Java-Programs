/*
                                     Probability

An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn.
Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.

Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100).

Sample Input 1 :
3 1
Sample Output 1:
42

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class Probability {
    public static int fact(int number) {
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int ncr(int num, int r) {
        int ans;
        ans = (fact(num) / (fact(num - r)) / fact(r));
        return ans;
    }

    public static int probability(int n, int x) {
        int ans = ncr(4, x) * ncr(4, n - x);
        float prob = ans * 1.0f / ncr(8, n);
        return (int) (prob*100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(probability(n, x));
    }
}

/*
                                    String to Integer
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

Input Format :
Integer N

Output Format :
Number of zeros in N

Constraints :
0 <= N <= 10^9

Sample Input 1 :
0
Sample Output 1 :
1

Sample Input 2 :
00010204
Sample Output 2 :
2
Explanation for Sample Output 2 :
Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it to an integer, it becomes 10204.
Sample Input 3 :
708000
Sample Output 3 :
4
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class stringToInteger {
    public static int convertStringToInt(String input) {
        if (input.length() == 0) {
            return 0;
        }
        int smallOutput = convertStringToInt(input.substring(0, input.length() - 1));
        int val = (int) input.charAt(input.length() - 1);
        val = val - 48;
        return val + (smallOutput * 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(convertStringToInt(input));
    }
}
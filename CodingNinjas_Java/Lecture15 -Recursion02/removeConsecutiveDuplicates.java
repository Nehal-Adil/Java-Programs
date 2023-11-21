/*
                     Remove Duplicates Recursively
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class removeConsecutiveDuplicates {
    public static String removeDuplicates(String input) {
        if (input.length() <= 1) {
            return input;
        }
        if (input.charAt(0) == input.charAt(1)) {
            return removeDuplicates(input.substring(1));
        } else {
            return input.charAt(0) + removeDuplicates(input.substring(1));
        }
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(removeDuplicates(input));
    }
}

/*
                                    Remove X
Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S.

Sample Input 1 :
xaxb
Sample Output 1:
ab

Sample Input 2 :
abc
Sample Output 2:
abc

Sample Input 3 :
xx
Sample Output 3:
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class removeCharX {

    public static String removeX(String input) {
        if (input.length() == 0) {
            return input;
        }
        String smallOutput = removeX(input.substring(1));
        char x = 'x';
        if (input.charAt(0) == x) {
            return smallOutput;
        } else {
            return input.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(removeX(input));
    }
}

/*
                            Check Palindrome (Recursion)
Check whether a given String S is a palindrome using recursion. Return true or false.

Input Format :
String S

Output Format :
'true' or 'false'

Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.

Sample Input 1 :
racecar
Sample Output 1:
true

Sample Input 2 :
ninja
Sample Output 2:
false
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class checkPalindromeRecursive {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String example = sc.next();
        System.out.println(isPalindrome(example));


    }
}

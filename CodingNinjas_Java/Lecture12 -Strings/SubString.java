/*
                                                                            All substrings

For a given input string(str), write a function to print all the possible substrings.
Substring
A substring is a contiguous sequence of characters within a string.
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous

Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.

Output Format:
Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.
Note:
The order in which the substrings are printed, does not matter.

Sample Input 1:
abc
Sample Output 1:
a
ab
abc
b
bc
c

Sample Input 2:
co
Sample Output 2:
c
co
o

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class SubString {

    public static void printSubStrings(String str) {
        int n = str.length();

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.println(str.substring(start, end + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.next();

        printSubStrings(str);
    }
}

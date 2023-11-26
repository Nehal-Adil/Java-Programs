/*
                                                        Reverse String Wordwise

Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word
at 2nd place and so on. Individual words should remain as it is.

Input format :
String in a single line

Output format :
Word wise reversed string in a single line

Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome

Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class ReverseStringWordwise {
    public static String reverseWordWise(String input) {

        String ans = "";
        int start;
        int end = input.length() - 1;
        String word = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                start = i + 1;
                word = "";
                for (int j = start; j <= end; j++) {
                    word += input.charAt(j);
                }
                end = i - 1;
                ans = ans + word + " ";
            }
        }
        word = "";
        for (int j = 0; j <= end; j++) {
            word = word + input.charAt(j);
        }
        ans += word;

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
//        System.out.println(input.length());
    }
}

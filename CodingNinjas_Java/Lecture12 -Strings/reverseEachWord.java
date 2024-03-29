/*
                                          Reverse Each Word
The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".

Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents
the sentence given to Aadil.

Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed.

Constraints:
0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second

Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN

Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class reverseEachWord {
    public static String reverseWord(String input) {
        // understand the difference between " " & ""
        input += " ";
        String out = "";
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                out += s + " ";
                s = "";
            } else {
                s = input.charAt(i) + s;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = reverseWord(str);
        System.out.println(ans);

    }
}

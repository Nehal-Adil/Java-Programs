/*
                                                Check Redundant Brackets
For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the
expression contains only rounded brackets or parenthesis and the input expression will always be balanced.

A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.

Example:
Expression: (a+b)+c
Since there are no needless brackets, hence, the output must be 'false'.

Expression: ((a+b))
The expression can be reduced to (a+b). Hence, the expression has redundant brackets and the output will be 'true'.
Note:
You will not get a partial score for this problem. You will get marks only if all the test cases are passed.
Return "false" if no brackets are present in the input.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the expression.

Time Limit: 1 second
Sample Input 1:
a+(b)+c
Sample Output 1:
true
Explanation:
The expression can be reduced to a+b+c. Hence, the brackets are redundant.

Sample Input 2:
(a+b)
Sample Output 2:
false

 */

package CodingNinjas_DSA;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
    public static boolean checkRedundantBrackets(String expression) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                stack.pop();
                if (count == 0 || count == 1)
                    return true;

            } else {
                stack.push(expression.charAt(i));
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String expression = sr.next();
        System.out.println(checkRedundantBrackets(expression));
    }
}

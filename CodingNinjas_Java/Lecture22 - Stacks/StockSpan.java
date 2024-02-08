/*

Amit has been working with an organization called 'Money Traders' for the past few years. The organization is into the money trading business.
His manager assigned him a task. For a given array/list of stock's prices for N days, find the stock's span for each day.

The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards)
for which the price of the stock was less than today's price.

For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].

Explanation:
On the sixth day when the price of the stock was 75, the span came out to be 4, because the last 4 prices(including the current price of 75)
were less than the current or the sixth day's price.

Similarly, we can deduce the remaining results.
Amit has to return an array/list of spans corresponding to each day's stock's price. Help him to achieve the task.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^7
1 <= X <= 10^9
Where X denotes the stock's price for a day.

Time Limit: 1 second

Sample Input 1:
4
10 10 10 10
Sample Output 1:
1 1 1 1

Sample Input 2:
8
60 70 80 100 90 75 80 120
Sample Output 2:
1 2 3 4 1 1 2 8
 */


package CodingNinjas_DSA;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    static int[] stockSpan(int price[]) {

        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<Integer>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < price.length; i++) {


            while (!stack.isEmpty() && price[i] > price[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;

            } else {
                span[i] = i - stack.peek();


            }
            stack.push(i);


        }
        return span;
    }

    public static int[] takeInput() {
        Scanner sr = new Scanner(System.in);
        int size = sr.nextInt();
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        for (int i = 0; i < size; i++) {
            input[i] = sr.nextInt();
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = takeInput();

        int[] output = stockSpan(input);

        printArray(output);
    }
}

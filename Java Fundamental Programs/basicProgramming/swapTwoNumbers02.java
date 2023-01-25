//Java Program to Swap Two values

package basicProgramming;

import java.util.Scanner;

public class swapTwoNumbers02 {
    public static void main(String[] args) {
        // Approach 2: Swapping the Values Without Using Third Variable by using sum and differences
        // concepts of maths

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.print("Num1: ");
        num1 = sc.nextInt();
        System.out.print("Num2: ");
        num2 = sc.nextInt();

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("After Swapping");

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
}

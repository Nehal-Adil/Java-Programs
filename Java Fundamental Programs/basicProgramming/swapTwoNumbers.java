//Java Program to Swap Two Numbers

package basicProgramming;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Swapping the Values Using Third Variable
        int num1, num2, temp;
        System.out.print("Num1: ");
        num1 = sc.nextInt();
        System.out.print("Num2: ");
        num2 = sc.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
}

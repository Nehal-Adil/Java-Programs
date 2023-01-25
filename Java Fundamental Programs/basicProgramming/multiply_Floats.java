//Java Program to print Multiplication of two floating point Number.

package basicProgramming;

import java.util.Scanner;

public class multiply_Floats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();

        System.out.print("Multiplication sum is: " + f1 * f2);
    }
}

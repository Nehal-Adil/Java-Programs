// Java Program to find the Factorial of a number
// Recursive Function method

package basicProgramming;

import java.util.Scanner;

public class factorial02 {
    static  int factorial (int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num -1);
    }

    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Factorial of " + num + " is: " + factorial(num));
    }
}

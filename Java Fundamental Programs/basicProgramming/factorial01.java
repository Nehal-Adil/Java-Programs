// Java Program to find the Factorial of a number
// Iterative Method

package basicProgramming;

import java.util.Scanner;

public class factorial01 {
    static int factorial(int num) {
        int fact = 1;
        if(num == 0 || num == 1){
            return 1;
        }
        for (int i=2; i<=num; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Factorial of " + num + " is: " + factorial(num));
    }
}

// Java program to print all the prime numbers from 1 to N;

package basicProgramming;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, j, isPrime;
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        System.out.println("All Prime numbers between 1 and " + num + " are: ");

        for (i = 2; i <= num; i++) {
            isPrime = 0;
            for (j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// Java Program to Check if Given Integer is Odd or Even

package basicProgramming;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println( "0 is neither Even nor Odd");
        } else if (num % 2 == 0) {
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }
    }
}

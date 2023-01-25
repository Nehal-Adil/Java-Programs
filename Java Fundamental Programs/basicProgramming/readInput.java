// Java program to take an integer as input and print it

package basicProgramming;

import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner sc = new Scanner(System.in);

//        Enter & Display integer
//        int num;
//        System.out.println("Enter the integer: ");
//
//        num = sc.nextInt();
//
//        System.out.println("The integer is " + num);

        String str;
        System.out.print("Enter your Name: ");
        str = sc.next();

        System.out.println("Good Morning " + str);
    }
}

// Java Program to Find the Largest of three Numbers

package basicProgramming;

import java.util.Scanner;

public class largestNum01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println(num3 + " is largest");
        }
    }

//     if (num1 > num2) {
//            if (num1 > num3) {
//                System.out.println(num1 + " is largest");
//            } else {
//                System.out.println(num3 + " is largest");
//            }
//        } else {
//            if (num2 > num3) {
//                System.out.println(num2 + " is largest");
//            } else {
//                System.out.println(num3 + " is largest");
//            }
//        }

}

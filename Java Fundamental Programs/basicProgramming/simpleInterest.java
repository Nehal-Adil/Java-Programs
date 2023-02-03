package basicProgramming;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate: ");
        float r = sc.nextFloat();
        System.out.print("Enter the time: ");
        float t = sc.nextFloat();

        float simpleInterest = (p * r * t) / 100;
        System.out.print("Simple Interest = " + simpleInterest);
    }
}

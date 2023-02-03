package basicProgramming;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the time: ");
        float time = sc.nextFloat();

        double compoundInterest = principal * (Math.pow((1 + rate / 100), time));

        System.out.print("Compound Interest = " + compoundInterest);
    }
}

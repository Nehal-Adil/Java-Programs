// Java program to check if the given year is a Leap year.

package basicProgramming;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        System.out.print("Enter any Year: ");
        year = sc.nextInt();

        if(year%4==0){
            isLeapYear = true;

            if(year%100 == 0){
                if(year%400==0){
                    isLeapYear = true;
                }else {
                    isLeapYear = false;
                }
            }
        }else {
            isLeapYear = false;
        }

        if (!isLeapYear){
            System.out.print(year+" is NOT a LEAP year");
        }else {
            System.out.print(year+" is a LEAP year");
        }
    }
}

//Leap Year Conditions
//--> A century year is a year ending with 00. A century year is a Leap year only if it is divisible by 400.
//--> A year (except a century  year) can be a leap year if it is exactly divisible by 4.
//--> A century year should be divisible by 4 and 100 both.
//--> A non-century year should be divisible only by 4
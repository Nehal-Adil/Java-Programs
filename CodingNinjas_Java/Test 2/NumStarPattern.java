/*
                                Number Star Pattern

Print the following pattern for given number of rows.

Input format :
Line 1 : N (Total number of rows)

    Sample Input :
    5
    Sample Output :
    1234554321
    1234**4321
    123****321
    12******21
    1********1
 */

package CodingNinjas_Java;

import java.util.Scanner;

public class NumStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(j);
                j++;
            }
            int star =1;
            while (star <=i-1) {
                System.out.print("*");
                star++;
            }
            int dec =i-1;
            while(dec>=1){
                System.out.print("*");
                dec--;
            }
            int decNum = 1;
            int p = n-i+1;
            while (decNum <= n-i+1){
                System.out.print(p);
                p--;
                decNum++;
            }
            System.out.println();
            i++;
        }
    }
}

package patternPrograms;

import java.util.Scanner;

public class characterPattern03 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                char ith = (char) ('A' + i - 1);
                System.out.print(ith + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// A
// B B
// C C C
// D D D D
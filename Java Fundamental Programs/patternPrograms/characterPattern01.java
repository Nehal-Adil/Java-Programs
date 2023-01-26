package patternPrograms;

import java.util.Scanner;

public class characterPattern01 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                char jth = (char) ('A' + j - 1);
                System.out.print(jth + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// A B C D
// A B C D
// A B C D
// A B C D
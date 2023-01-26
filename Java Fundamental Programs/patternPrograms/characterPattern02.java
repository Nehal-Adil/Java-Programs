package patternPrograms;

import java.util.Scanner;

public class characterPattern02 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            char p = (char) ('A' + i - 1);
            while (j <= n) {
                System.out.print(p + " ");
                p = (char) (p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// A B C D
// B C D E
// C D E F
// D E F G
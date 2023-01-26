package patternPrograms;

import java.util.Scanner;

public class characterPattern05 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            char p = (char) ('E' - i + 1);
            while (j <= i) {
                System.out.print(p + " ");
                p = (char) (p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// E
// D E
// C D E
// B C D E
// A B C D E
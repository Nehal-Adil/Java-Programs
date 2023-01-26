package patternPrograms;

import java.util.Scanner;

public class triangularPattern01 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j=j+1;
            }
            System.out.println("");
            i=i+1;
        }
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
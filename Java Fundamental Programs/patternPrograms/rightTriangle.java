package patternPrograms;

import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j=1;
            while (j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// *
// * *
// * * *
// * * * *
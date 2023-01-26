package patternPrograms;

import java.util.Scanner;

public class leftTraingle {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int j=1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//       *
//     * *
//   * * *
// * * * *
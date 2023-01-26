package patternPrograms;

import java.util.Scanner;

public class pyramidNumberPattern02 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int spaces =1;
            while (spaces<=n-i){
                System.out.print("  ");
                spaces++;
            }
            int j=1;
            int p=i;
            while (j<=i){
                System.out.print(p+" ");
                p++;
                j++;
            }
            int dec=i-1;
            while (dec>=1){
                System.out.print(p-2+" ");
                p--;
                dec--;
            }
            i++;
            System.out.println();
        }
    }
}

//      1
//    2 3 2
//  3 4 5 4 3
//4 5 6 7 6 5 4

package patternPrograms;

import java.util.Scanner;

public class squarePattern04 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print(n + " ");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}

// 4 4 4 4
// 4 4 4 4
// 4 4 4 4
// 4 4 4 4
package patternPrograms;

import java.util.Scanner;

public class squarePattern03 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            int j=n;
            while (j>=1){
                System.out.print(j + " ");
                j=j-1;
            }
            System.out.println("");
            i=i+1;
        }
    }
}

// 4 3 2 1
// 4 3 2 1
// 4 3 2 1
// 4 3 2 1
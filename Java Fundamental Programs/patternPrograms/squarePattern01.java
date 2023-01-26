package patternPrograms;

import java.util.Scanner;

public class squarePattern01 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print(i + " ");
                j=j+1;
            }
            System.out.println("");
            i=i+1;
        }
    }
}

// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
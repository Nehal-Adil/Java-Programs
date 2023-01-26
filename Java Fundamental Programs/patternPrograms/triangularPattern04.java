package patternPrograms;

import java.util.Scanner;

public class triangularPattern04 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j=1;
            int p=i;
            while (j<=i){
                System.out.print(p+" ");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// 1
// 2 1
// 3 2 1
// 4 3 2 1
package basicProgramming;

import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declaring array
        int[] arr = new int[n];

        //Enter values in array
        System.out.println("Enter the values of the array");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.print("Array: " );
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

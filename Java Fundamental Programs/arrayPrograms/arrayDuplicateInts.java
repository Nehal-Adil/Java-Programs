// Write a Java program to find duplicate values in an array of integer values.

package basicProgramming;

import java.util.Scanner;

public class arrayDuplicateInts {

    // Function to take values of Array
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // main Function
    public static void main(String[] args) {
        int[] my_array1 = takeInput();
        int n = my_array1.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((my_array1[i] == my_array1[j]) && (i != j)) {
                    System.out.println("Duplicate Element: " + my_array1[j]);
                }
            }
        }
    }
}

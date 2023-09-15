// Write a Java program to find the second-largest element in an array.

package basicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class arraySecondMax {

    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println("Second Largest Element: " + secondLargest(arr));
    }

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

}

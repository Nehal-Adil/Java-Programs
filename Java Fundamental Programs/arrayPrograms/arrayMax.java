// Write a Java program to find the maximum element in an array of integers.

package basicProgramming;

import java.util.Scanner;

public class arrayMax {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Largest Element in the Array: " + findMax(arr));

    }

    public static int[] takeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

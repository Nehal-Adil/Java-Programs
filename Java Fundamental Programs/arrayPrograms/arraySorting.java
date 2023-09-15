package basicProgramming;

import java.util.Scanner;

public class arraySorting {

    // Sorting Function
    public static void SortedArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();

        System.out.print("Given Array: ");
        printArray(arr);
        System.out.println();

        SortedArray(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);

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

    // To print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

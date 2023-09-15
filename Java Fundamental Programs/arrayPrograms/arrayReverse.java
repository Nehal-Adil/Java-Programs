package basicProgramming;

import java.util.Scanner;

public class arrayReverse {

    //Reverse Function
    public static void reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("New Array: ");
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Old Array: ");
        printArray(arr);
        System.out.println();
        reverse(arr);
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

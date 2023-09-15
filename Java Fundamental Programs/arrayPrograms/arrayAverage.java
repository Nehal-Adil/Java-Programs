// Write a Java program to calculate the average of elements in an array.

package basicProgramming;

import java.util.Scanner;

public class arrayAverage {

    // Global Variable
    public static int n;


    public static int findAverage(int arr[]){
        int average = findSum(arr) / n;
        return average;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Average: " + findAverage(arr));
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findSum(int arr[]) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

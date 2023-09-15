package basicProgramming;

import java.util.Scanner;

public class arraySum {
    public static int findSum(int arr[]) {
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();

        System.out.print("Array Sum: ");
        System.out.print(findSum(arr));
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
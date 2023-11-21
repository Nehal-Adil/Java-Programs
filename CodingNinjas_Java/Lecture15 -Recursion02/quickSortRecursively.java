/*
                                            Quick Sort
Sort an array A using Quick Sort. Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)

Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 10^3

Sample Input 1 :
6
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8

Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7
*/

package CodingNinjas_Java;

import java.util.Scanner;

public class quickSortRecursively {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotPos = partition(arr, start, end);

        quickSort(arr, start, pivotPos - 1);
        quickSort(arr, pivotPos + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        int pivotPos = start + count;
        // swap pivot and the element in pivot position
        int temp = arr[pivotPos];
        arr[pivotPos] = arr[start];
        arr[start] = temp;

        int i = start, j = end;
        while (i < pivotPos && j > pivotPos) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else {
                // swap the element that is supposed to be on the other side
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotPos;
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSortRecursively.quickSort(input, 0, input.length - 1);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

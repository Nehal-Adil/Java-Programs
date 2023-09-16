// Write a Java program to test if an array contains a specific value.

package basicProgramming;

import java.util.Scanner;

public class arraySearch01 {

    public static boolean contains(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {
                24, 65, 78, 96, 45, 55, 32, 68, 75, 35, 69, 42, 58, 97, 66, 39
        };

        int[] array2 = {
                124, 265, 378, 496, 545, 655, 732, 868, 975, 335, 569, 472, 588, 997, 866, 339
        };

        System.out.println(contains(array1, 69));
        System.out.println(contains(array2, 545));

    }
}

// Write a Java program to find the maximum and minimum value of an array.

package basicProgramming;

import java.util.Arrays;

public class arrayMax_Min {
    public static void max_min(int[] my_array) {
        int max = my_array[0];
        int min = my_array[0];
        int n = my_array.length;

        for (int i = 0; i < n - 1; i++) {
            if (my_array[i] > max) {
                max = my_array[i];
            }

            if (my_array[i] < min) {
                min = my_array[i];
            }
        }
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(" Original Array: " + Arrays.toString(my_array));
        max_min(my_array);
    }
}

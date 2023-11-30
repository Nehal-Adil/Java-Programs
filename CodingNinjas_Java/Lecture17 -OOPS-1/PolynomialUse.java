/*
    Test Case 1:
 3      --> n
 3 1 7  --> degree[i]
 1 2 3  --> coeff[i]
 2      --> n
 2 1    --> degree[i]
 7 8    --> coeff[i]
 1      --> choice (add)

 Expected Output:
 10x1 7x2 1x3 3x7

    Test Case 2:
 3
 3 1 7
 1 2 3
 2
 2 1
 7 8
 2

 Expected Output:
 -6x1 -7x2 1x3 3x7

    Test Case 3:
 3
 3 1 7
 1 2 3
 2
 2 1
 7 8
 3

 Expected Output:
 16x2 14x3 8x4 7x5 24x8 21x9

 */

package CodingNinjas_Java;

import java.util.Scanner;

public class PolynomialUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        int degree1[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }

        n = s.nextInt();
        int degree2[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for (int i = 0; i < n; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }

        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2:
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3:
                result = first.multiply(second);
                result.print();
                break;
        }
    }
}

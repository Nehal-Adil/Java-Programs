// Java program to check whether the character is vowel or constant

package basicProgramming;

import java.util.Scanner;

public class checkVowel {
    static void check_Vowel(char y) {
        if(y =='a' || y =='e' || y =='i' || y=='o' || y=='u') {
            System.out.println("Vowel");
        }else {
            System.out.println("Constant");
        }
    }

    public static void main(String[] args) {
        check_Vowel('i');
    }
}

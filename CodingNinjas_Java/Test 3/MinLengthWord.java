/*

Given a string S (that can contain multiple words), you need to find the word which has minimum length.

Note : If multiple words are of same length, then answer will be first minimum length word in the string. Words are seperated by single space only.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string
Sample Output 1 :
is

Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a

 */

package Test3;

import java.util.Scanner;

public class MinLengthWord {
    public static String minLengthWord(String input){

        int spaceIndex=0;
        int startIndex=0;
        int endIndex=0;
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<=input.length();i++) {

            if(i==input.length() || input.charAt(i)==' ' ) {
                int length= i-spaceIndex;
                if(minLength > length) {
                    minLength=length;
                    startIndex=spaceIndex;
                    endIndex=i;
                }
                spaceIndex=i+1;
            }


        }
        return input.substring(startIndex,endIndex);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(minLengthWord(str));
    }
}

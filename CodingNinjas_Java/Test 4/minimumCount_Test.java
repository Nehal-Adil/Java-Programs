package CodingNinjas_Java;

import java.util.Scanner;

public class minimumCount_Test {
    public static int minCount(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++)
            dp[i] = i;
        for (int i = (int) Math.sqrt(n); i <= n; i++) {
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - (j * j)]);
            }
        }
        return (dp[n]);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(minCount(num));
    }

}

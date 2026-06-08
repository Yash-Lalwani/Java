// Time Complexity = O(n)

package DP_1;

public class DP_Fib_Tabulation {

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 0; // not really needed to do, cuz it's already 0. just so that i can vizualize.
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // answer
    }

    public static void main(String args[]) {
        int n = 5;

        System.out.println(fibTabulation(n));
    }
}
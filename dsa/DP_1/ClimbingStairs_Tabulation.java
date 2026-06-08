package DP_1;

// time complexity = O(n)
public class ClimbingStairs_Tabulation {

    public static int countWays(int n) {
        int dp[] = new int[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        // Fill from bottom-up
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println(countWays(n));
    }
}
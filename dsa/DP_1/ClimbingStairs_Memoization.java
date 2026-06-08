package DP_1;

public class ClimbingStairs_Memoization {
    public static int stairs(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = stairs(n-1, dp) + stairs(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n+1];

        System.out.println(stairs(n, dp));
    }
}

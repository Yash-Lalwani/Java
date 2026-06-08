package DP_1;

// time complexity = O(n)
public class ClimbingStairs_Memoization_Variation {
    public static int countWays(int n, int[] dp) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = countWays(n-1, dp) + countWays(n-2, dp) + countWays(n-3, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 2;
        int dp[] = new int[n+1];

        System.out.println(countWays(n, dp));
    }
}
// Space Complexity = O(n * W)
// Time Complexity = O(n * W)
// becuase that's the size of 2d array, and the worst case is all cells in that would fill means that will be the most values that can be calculated for this code.

package DP_2;

public class Knapsack_01_Memoization{

    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) { // valid

            // include condition
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);

            // exclude condtion
            int ans2 = knapsack(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W]; 

        } else { // not valid
            dp[n][W] =  knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String args[]) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        int dp[][] = new int[val.length+1][W+1];
        for(int i = 0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack(val, wt, W, val.length, dp));
    }
}
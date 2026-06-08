package DP_1;

import java.util.Scanner;

public class ClimbingStairs_Recursion {
    public static int stairs(int n) {
        // ways to climb 0 stairs = 1 (do nothing)
        // ways to climb 1 stair = 1 (jump to first)
        if (n == 0 || n == 1) {
            return 1;
        }

        return stairs(n-1) + stairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(stairs(input));
    }
}

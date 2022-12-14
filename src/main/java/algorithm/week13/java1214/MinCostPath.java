package algorithm.week13.java1214;

import java.util.Arrays;

public class MinCostPath {
    public static void main(String[] args) {
        int[] coins = new int[]{2, 7, 40, 19};
        int[][] dp = new int[coins.length][coins.length];
        for (int i = 0; i < coins.length; i++) {
            for (int j = i; j < coins.length; j++) {
                if(j==0)
                    dp[i][j] = coins[0];
                else
                    dp[i][j] = dp[i][j - 1] + coins[i];
            }
        }

        for (int j = 0; j < coins.length; j++) {
            System.out.println(Arrays.toString(dp[j]));
        }
    }
}

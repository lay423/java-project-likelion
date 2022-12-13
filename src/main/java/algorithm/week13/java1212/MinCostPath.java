package algorithm.week13.java1212;

public class MinCostPath {
    public static int getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0]=1;
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}};
        System.out.println(getMinCost(matrix));

    }
}

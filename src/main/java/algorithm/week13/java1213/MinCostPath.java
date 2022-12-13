package algorithm.week13.java1213;

class Pair{
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return "{left=" + left + " right=" + right+"}";
    }

}

public class MinCostPath {
    public static int getMinCost(int[][] matrix) {
        int[][] dp = new int[4][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (i == j) {

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Pair[][] dp = new Pair[4][4];
        int matrix[] = new int[]{2, 7, 40, 19};
        for (int i = 0; i < matrix.length; i++) {
            dp[i][i] = new Pair(matrix[i], 0);
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(dp[i][i].toString());
        }
        //        int[][] matrix = {
//                {1, 3, 2},
//                {4, 6, 2},
//                {1, 2, 4}};
//        System.out.println(getMinCost(matrix));

    }
}

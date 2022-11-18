package algorithm.week9.java1118;

import org.junit.jupiter.api.Assertions;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public int[][] solutionMul(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] *= arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        MatrixAddition ma = new MatrixAddition();
        int[][] arr1 = new int[][]{{1, 2}, {2, 3}};
        int[][] arr2 = new int[][]{{3, 4}, {5, 6}};
        Assertions.assertEquals(new int[][]{{4, 6}, {7, 9}}, ma.solution(arr1, arr2));
        Assertions.assertEquals(new int[][]{{3, 8}, {10, 18}}, ma.solutionMul(arr1, arr2));

    }
}

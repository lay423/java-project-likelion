package java1012.algorithm;

import java.util.Scanner;

public class MaxNum2 {

    public int[] getNum(int[][] arr){

        int max = 0, iIdx = 0, jIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (max < arr[i][j]) {
                    max = arr[i][j];
                    iIdx = i;
                    jIdx = j;
                }
            }
        }

        return new int[]{max, iIdx+1, jIdx+1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxNum2 maxNum2 = new MaxNum2();

        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        int[] result = maxNum2.getNum(arr);
        System.out.println(result[0]);
        System.out.println((result[1]) + " " + (result[2]));
    }
}

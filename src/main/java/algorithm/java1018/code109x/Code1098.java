package algorithm.java1018.code109x;

import java.util.Scanner;

public class Code1098 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h+1][w+1];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < l; j++) {
                arr[x][y] = 1;
                if (d == 0) {
                    y++;
                }else x++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}

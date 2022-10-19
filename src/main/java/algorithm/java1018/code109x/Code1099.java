package algorithm.java1018.code109x;

import java.util.Scanner;

public class Code1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[11][11];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = 2, y = 2;
        int d = 0;
        while (true) {
            if(arr[x][y]==2){
                arr[x][y] = 9;
                break;
            }
            arr[x][y] = 9;
            if (arr[x + 1][y] == 1 && arr[x][y + 1] == 1) {
                break;
            } else if (arr[x][y + 1] == 1) {
                x++;
            } else {
                y++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

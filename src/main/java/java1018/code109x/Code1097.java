package java1018.code109x;

import java.util.Scanner;

public class Code1097 {

    public int cross(int n) {
        if (n == 0) {
            return 1;
        }else return 0;
    }

    public static void main(String[] args) {
        Code1097 code1097 = new Code1097();
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                arr[num1-1][j] = code1097.cross(arr[num1-1][j]);
                arr[j][num2-1] = code1097.cross(arr[j][num2-1]);
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

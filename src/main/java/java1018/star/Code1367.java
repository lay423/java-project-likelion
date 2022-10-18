package java1018.star;

import java.util.Scanner;

public class Code1367 {

    public void drawParallelogram(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = n - j-1; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code1367 code1367 = new Code1367();
        int num = sc.nextInt();
        code1367.drawParallelogram(num);

    }
}

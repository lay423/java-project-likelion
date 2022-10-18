package java1018.star;

import java.util.Scanner;

public class Code1356 {
    public void drawEmptySquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Code1356 code1356 = new Code1356();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        code1356.drawEmptySquare(num);
    }
}

package algorithm.week10.java1124;

import java.util.Scanner;

public class DrawStar {

    void draw(int n) {
        if (n <= 0) {
            return;
        }
        draw(n - 1);
        System.out.print("*");

    }

    void drawRow(int n) {
        if (n <= 0) {
            return;
        }
        drawRow(n-1);
        draw(n);
        System.out.println();
    }

    public static void main(String[] args) {
        DrawStar main = new DrawStar();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        main.drawRow(num);

    }
}

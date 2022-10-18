package java1018.star;

import java.util.Scanner;

public class Code1859 {

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
        Code1859 code1859 = new Code1859();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        code1859.drawRow(num);

    }
}

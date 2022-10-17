package java1017.drawStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DrawStar star = new DrawStar('*');
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        star.drawPyramid(num);

    }
}

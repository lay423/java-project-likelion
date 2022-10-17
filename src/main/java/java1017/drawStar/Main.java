package java1017.drawStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DrawStar star = new DrawStar('*');
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        star.drawRhombus(num);
        int j=1;
        for (int i = 21; i <= 30; i++) {
            System.out.println("ps.setString("+i+", this.team"+j+");");
            j++;
        }
    }
}

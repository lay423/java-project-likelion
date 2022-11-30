package algorithm.week11.java1130;

import java.util.Scanner;

public class BinaryTree {
    public static int getDistance(int a, int b) {
        if (a > b) {
            return getDistance(a/2,b)+1;
        } else if (a < b) {
            return getDistance(a,b/2)+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getDistance(a, b));

    }
}

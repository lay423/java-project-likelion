package java1013.code106x;

import java.util.Scanner;

public class Code1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d", a > b ? a : b);
    }
}

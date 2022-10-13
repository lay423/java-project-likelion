package java1013.code106x;

import java.util.Scanner;

public class Code1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a < b ? a : b;
        System.out.printf("%d", max < c ? max : c);
    }
}

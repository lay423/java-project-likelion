package java1011.codeUp104x;

import java.util.Scanner;

public class Code1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
        System.out.printf("%.2f", n1 / (float) n2);
    }
}

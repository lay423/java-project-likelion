package java1011.codeUp104x;

import java.util.Scanner;

public class Code1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = n1 + n2 + n3;
        System.out.println(sum);
        System.out.printf("%.1f", sum/(float)3);
    }
}

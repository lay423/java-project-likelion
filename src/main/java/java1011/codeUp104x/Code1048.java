package java1011.codeUp104x;

import java.util.Scanner;

public class Code1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            a *= 2;
        }
        System.out.println(a);
    }
}

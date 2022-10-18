package java1017.code108x;

import java.util.Scanner;

public class Code1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num * i);
        }

    }
}

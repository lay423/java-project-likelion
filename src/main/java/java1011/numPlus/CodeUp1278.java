package java1011.numPlus;

import java.util.Scanner;

public class CodeUp1278 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while (num > 0) {
            num /=10;
            result++;
        }
        System.out.println(result);
    }
}

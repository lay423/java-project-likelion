package java1013.code106x;

import java.util.Scanner;

public class Code1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("minus");
        }else {
            System.out.println("plus");
        }
        if (a % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}

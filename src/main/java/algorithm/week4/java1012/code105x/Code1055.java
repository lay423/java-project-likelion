package algorithm.week4.java1012.code105x;

import java.util.Scanner;

public class Code1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 == 1 || n2 == 1) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}

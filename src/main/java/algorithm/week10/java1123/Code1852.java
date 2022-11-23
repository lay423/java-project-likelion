package algorithm.week10.java1123;

import java.util.Scanner;

public class Code1852 {
    public static void printNum(int n, int answer) {
        if (answer == n) {
            System.out.print(answer);
            return;
        }
        System.out.print(answer+" ");
        printNum(n, answer+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n, 1);
    }
}

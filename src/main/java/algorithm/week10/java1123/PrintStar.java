package algorithm.week10.java1123;

import java.util.Scanner;

public class PrintStar {
    public static void print(int n) {
        if(n==0)
            return;
        System.out.print("*");
        print(n - 1);
    }

    public static int fibonacci(int idx, int a, int b) {
        if(idx <=2) return b;
        int tmp = b;
        b = a+b;
        a = tmp;
        return fibonacci(idx - 1, a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n, 1, 1));


    }
}

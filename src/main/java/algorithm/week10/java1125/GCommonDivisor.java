package algorithm.week10.java1125;

import java.util.Scanner;

public class GCommonDivisor {
    public static int gcd(int a, int b, int div) {
        if (a % div == 0 && b % div == 0)
            return div;
        return gcd(a, b, div - 1);
    }

    public static int gcd2(int a, int b) {
        if (a == b) return a;
        else if (a < b) return gcd2(a, b - a);
        else if (a > b) return gcd2(a - b, b);
        else return 1;
    }

    public static int gcd3(int a, int b){
        while (a != b) {
            if (a > b) {
                a = a-b;
            }else {
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b, Math.min(a, b)));
        System.out.println(gcd2(a, b));
        System.out.println(gcd3(a,b));
    }
}

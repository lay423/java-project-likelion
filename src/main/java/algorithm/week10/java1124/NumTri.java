package algorithm.week10.java1124;

import java.util.Scanner;

public class NumTri {
    public static void printNums(int n, int answer) {
        if(n<answer) return;
        System.out.println(getNums(answer));
        printNums(n, answer+1);

    }

    public static String getNums(int n) {
        if(n==1) return "1";
        return getNums(n-1)+" "+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n, 1);
    }

}

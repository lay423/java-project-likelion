package algorithm.week10.java1123;

import java.util.Scanner;

public class Code1912 {
    public static int getFactorial(int n, int answer) {
        if(n<=1) return answer;
        answer *= n;
        return getFactorial(n - 1, answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n, 1));
    }
}

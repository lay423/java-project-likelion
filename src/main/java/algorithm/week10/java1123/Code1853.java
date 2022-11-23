package algorithm.week10.java1123;

import java.util.Scanner;

public class Code1853 {
    public static int getSum(int n, int answer) {
        if(n==0) return answer;
        answer += n;
        return getSum(n - 1, answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n, 0));


    }
}

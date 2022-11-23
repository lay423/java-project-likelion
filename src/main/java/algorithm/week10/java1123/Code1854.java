package algorithm.week10.java1123;

import java.util.Scanner;

public class Code1854 {
    public static int getSum(long n, int answer) {
        if(n==0) return answer;
        answer += n%10;
        return getSum(n/10, answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(getSum(n, 0));
    }
}

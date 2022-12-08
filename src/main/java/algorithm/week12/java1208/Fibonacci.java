package algorithm.week12.java1208;

public class Fibonacci {
    public static long fib(int n, long[] memo) {
        if(n<=1) return 1;
        if (memo[n] == 0) {
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(6, new long[7]));
    }
}

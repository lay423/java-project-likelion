package algorithm.week12.java1208;

public class Fibonacci {

    private int[] memo;

    public Fibonacci(int n) {
        this.memo = new int[n + 1];
        this.memo[1]=1;
        this.memo[2]=2;
    }
    public static long fib(int n, long[] memo) {
        if (n <= 1) return 1;
        if (memo[n] == 0) {
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }

    public int fib2(int n) {
        for (int i = 1; i <= n; i++) {

            if (this.memo[i] == 0) {
                memo[i] = memo[i - 1] + memo[i - 2];
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(6, new long[7]));
        Fibonacci fibonacci = new Fibonacci(7);
        System.out.println(fibonacci.fib2(6));
    }
}

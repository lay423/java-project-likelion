package algorithm.week11.java1130;

public class SumOfCommonDivisor {
    public static int getSum(int n) {
        int answer=0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getSum(12));
    }
}

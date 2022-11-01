package algorithm.week7.java1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class PrimeNum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            int cntDivisor=0;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0)
                    cntDivisor++;
            }
            if (cntDivisor == 0) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrimeNum( int n, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, n); i++) {
            if (n % i == 0) return false;
        }
            return true;
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        System.out.println( pn.isPrimeNum(13, (a, b) -> a * a < b));
        System.out.println( pn.isPrimeNum(17, (a, b) -> a < b/2));
        System.out.println( pn.isPrimeNum(19, (a, b) -> a  < b));
    }
}

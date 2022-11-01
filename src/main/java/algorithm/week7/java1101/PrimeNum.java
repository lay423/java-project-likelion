package algorithm.week7.java1101;

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

    boolean someOperation(int a, int b) {
        return a<b;
    }
    public boolean isPrimeNum( int n) {
        for (int i = 2; someOperation(i, n); i++) {
            if (n % i == 0) return false;
        }
            return true;
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        System.out.println(pn.isPrimeNum(13));
    }
}

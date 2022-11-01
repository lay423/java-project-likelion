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

    public boolean isPrimeNum(int n) {
        int cntDivisor=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                cntDivisor++;
            }
        }
        if (cntDivisor == 0) {
            System.out.printf("%d는 소수입니다.", n);
            return true;
        }else {
            System.out.printf("%d는 소수가 아닙니다.", n);
            return false;
        }
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        pn.isPrimeNum(13);
        pn.isPrimeNum(17);
        pn.isPrimeNum(19);
        pn.isPrimeNum(20);
    }
}

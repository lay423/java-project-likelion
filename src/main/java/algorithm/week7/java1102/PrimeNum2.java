package algorithm.week7.java1102;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum2 {

    public int solution(int n) {
        List<Integer> primeNums = new ArrayList<>();
        boolean[] check = new boolean[n-1];
        for (int i = 0; i < check.length; i++) {
            check[i]=true;
        }
        for (int i = 2; i <= n; i++) {
            primeNums.add(i);
        }

        for (int i = 2; i*i < n; i++) {
            if(!(primeNums.contains(i)))
                continue;
            for (int j = 1; j < primeNums.size(); j++) {
                if (primeNums.get(j) % i == 0 && primeNums.get(j)!=i) {
                    check[primeNums.get(j)-2] = false;
                }
            }
        }
        int cnt=0;
        for (boolean b : check) {
            if (b) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        PrimeNum2 pn = new PrimeNum2();
        System.out.println(pn.solution(50));

    }
}

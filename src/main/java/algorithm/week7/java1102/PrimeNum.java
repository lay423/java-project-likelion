package algorithm.week7.java1102;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

    public int solution(int n) {
        List<Integer> primeNums = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            primeNums.add(i);
        }
        for (int i = 2; i < n; i++) {
            if(!(primeNums.contains(i)))
                continue;
            for (int j = 1; j < primeNums.size(); j++) {
                if (primeNums.get(j) % i == 0 && primeNums.get(j)!=i) {
                    primeNums.remove(j);
                }
            }
        }
        return primeNums.size();
    }

    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        System.out.println(pn.solution(100));
    }
}

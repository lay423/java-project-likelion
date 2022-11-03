package algorithm.week7.java1103;

import java.util.Arrays;

public class PrimeNum {


    int solution(int n){
        int[] nums = new int[n-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 2*(i-1); j < checks.length; j += i) {
                checks[j]=false;
            }
        }

        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            if (checks[i]) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        System.out.println(pn.solution(5));
    }
}

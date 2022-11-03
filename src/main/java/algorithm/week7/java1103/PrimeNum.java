package algorithm.week7.java1103;

import java.util.Arrays;

public class PrimeNum {


    int solution(int n){
        int cnt = n;
        int[] nums = new int[n-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;
        }
        for (int i = 2; i < checks.length; i += 2) {
            checks[i]= false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (checks[i]) {
                System.out.println(nums[i]);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        pn.solution(50);
    }
}

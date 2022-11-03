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
        return cnt;
    }
    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        System.out.println(pn.solution(50));
    }
}

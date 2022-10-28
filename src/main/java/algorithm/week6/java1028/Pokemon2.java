package algorithm.week6.java1028;

import java.util.HashSet;
import java.util.Set;

public class Pokemon2 {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int N = nums.length/2;
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {
        Pokemon2 pk = new Pokemon2();
        int[] nums1 = new int[]{3, 1, 2, 3};
        int[] nums2 = new int[]{3, 3, 3, 2, 2, 4};
        System.out.println(pk.solution(nums1));
        System.out.println(pk.solution(nums2));
    }
}

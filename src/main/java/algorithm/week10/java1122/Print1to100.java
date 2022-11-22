package algorithm.week10.java1122;


import java.util.ArrayList;
import java.util.List;

public class Print1to100 {
    public static void print1To100 (int n){
        if(n>100)
            return;

        System.out.println(n);
        print1To100(n+1);
    }

    public static int sum(List<Integer> nums) {
        if(nums.isEmpty())
            return 0;
        if(nums.size()==1)
            return nums.get(0);
        nums.add(nums.get(0) + nums.get(1));
        nums.remove(0);
        nums.remove(0);
        return sum(nums);

    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(sum(nums));

    }
}

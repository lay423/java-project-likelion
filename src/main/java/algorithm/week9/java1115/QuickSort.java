package algorithm.week9.java1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[]{20, 18, 5, 19, 40, 25, 5, 50};
        int mid = arr[arr.length / 2];
        List<Integer> firstList = new ArrayList<>();
        List<Integer> midList = new ArrayList<>();
        List<Integer> lastList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mid) {
                firstList.add(arr[i]);
            } else if (arr[i] > mid) {
                lastList.add(arr[i]);
            }else {
                midList.add(arr[i]);
            }
        }

        System.out.println(firstList.toString());
        System.out.println(midList.toString());
        System.out.println(lastList.toString());

    }
}

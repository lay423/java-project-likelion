package algorithm.week9.java1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;

    }
    public List<Integer> sort(List<Integer> arr) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> midList = new ArrayList<>();
        List<Integer> lastList = new ArrayList<>();
        int mid = arr.get(arr.size() / 2);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < mid) {
                firstList.add(arr.get(i));
            } else if (arr.get(i) > mid) {
                lastList.add(arr.get(i));
            }else {
                midList.add(arr.get(i));
            }
        }
        return merge(sort(firstList), sort(midList), sort(lastList));
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{20, 18, 5, 19, 40, 25, 5, 50};
        List<Integer> beforeList = new ArrayList<>();
        for (int i : arr) {
            beforeList.add(i);
        }
        List<Integer> arrList = qs.sort(beforeList);
        System.out.println(arrList);
    }
}

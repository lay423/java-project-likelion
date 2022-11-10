package algorithm.week8.java1110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExceptSameNum {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if(stack.isEmpty())
                stack.add(i);
            else if (stack.peek() != i) {
                stack.add(i);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.elementAt(i);
        }
        return answer;
    }

    public int[] solution2(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        numList.add(arr[0]);
        for (int i=1; i<arr.length;i++) {
            if (numList.get(numList.size()-1) != arr[i]) {
                numList.add(arr[i]);
            }
        }

        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        ExceptSameNum esn = new ExceptSameNum();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(esn.solution2(arr)));
    }
}

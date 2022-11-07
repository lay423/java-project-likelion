package algorithm.week8.java1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleArrayNum {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answers = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                answers.add(num);
            }
        }
        if (answers.size() == 0) {
            answers.add(-1);
        }

        int[] answer = new int[answers.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answers.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        DivisibleArrayNum dan = new DivisibleArrayNum();
        int[] arr = new int[]{5, 9, 7, 10};
        int[] arr1 = new int[]{3, 2, 6};
        int divisor = 10;
        int divisior = 5;
        System.out.println(Arrays.toString(dan.solution(arr1, divisor)));

    }
}

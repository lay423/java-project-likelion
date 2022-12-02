package algorithm.week11.java1201;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {

        }
        return answer;
    }

    public static void main(String[] args) {
        HallOfFame hff = new HallOfFame();
        int[] arr = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(hff.solution(3, arr)));
    }
}

package algorithm.week6.java1024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class IdxNum {
    int[] arr = {1, 5, 2, 6, 3, 7, 4};
    public int[] solution(int[] array, int[][] commands){
        int[] answer= new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] ofRange = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(ofRange);
            Arrays.toString(ofRange);
            answer[i] = ofRange[commands[i][2]-1];
        }
        return answer;
    }

    public int getKthNum(int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];

        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx - 1; i < toIdx; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution2(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        IdxNum idxNum = new IdxNum();
        arr = idxNum.solution2(arr, commands);
        System.out.println(Arrays.toString(arr));
    }
}

package algorithm.week6.java1024;

import java.util.Arrays;

public class IdxNum {

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

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        IdxNum idxNum = new IdxNum();
        arr = idxNum.solution(arr, commands);
        System.out.println(Arrays.toString(arr));
    }
}

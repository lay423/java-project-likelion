package algorithm.week8.java1110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int j=0;
        int k=0;
        List<Integer> answerList = new ArrayList<>();
        while (j<progresses.length) {
            for (int i = j; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            while (progresses[j] >= 100) {
                System.out.println("j: "+j+" k: "+k);
                j++;
                k++;
                if(j>= progresses.length){
                    answerList.add(k);
                    break;
                }
                if(progresses[j]<100) {
                    answerList.add(k);
                    k=0;
                }
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        FuncDevelop fd = new FuncDevelop();
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        int[] progresses2 = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds2 = new int[]{1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(fd.solution(progresses, speeds)));
        System.out.println(Arrays.toString(fd.solution(progresses2, speeds2)));
    }
}

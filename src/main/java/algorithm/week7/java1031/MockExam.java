package algorithm.week7.java1031;

public class MockExam {
    public int[] solution(int[] answer) {
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] stdAnswerCnt = new int[3];
        int[] stdAnswerCntIdx = {1, 2, 3};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == std1[i % 5]) {
                stdAnswerCnt[0]++;
            }
            if (answer[i] == std2[i % 8]) {
                stdAnswerCnt[1]++;
            }
            if (answer[i] == std3[i % 10]) {
                stdAnswerCnt[2]++;
            }
        }
        for (int i = 0; i < stdAnswerCnt.length; i++) {
            for (int j = i + 1; j < stdAnswerCnt.length; j++) {
                if (stdAnswerCnt[i] < stdAnswerCnt[j]) {
                    int tmp = stdAnswerCnt[i];
                    stdAnswerCnt[i] = stdAnswerCnt[j];
                    stdAnswerCnt[j] = tmp;

                    tmp = stdAnswerCntIdx[i];
                    stdAnswerCntIdx[i] = stdAnswerCntIdx[j];
                    stdAnswerCntIdx[j] = tmp;
                }
            }
        }

        for (int i = 0; i < stdAnswerCntIdx.length; i++) {
            System.out.printf("수포자 %d은 %d개의 문제를 맞혔습니다.\n", stdAnswerCntIdx[i], stdAnswerCnt[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] answer2 = {3, 3, 2, 1, 2, 5, 3, 2};
        MockExam mExam = new MockExam();
        mExam.solution(answer1);
        mExam.solution(answer2);
    /*
        수포자 1은 15개의 문제를 맞혔습니다.
        수포자 2은 2개의 문제를 맞혔습니다.
        수포자 3은 1개의 문제를 맞혔습니다.
        수포자 3은 4개의 문제를 맞혔습니다.
        수포자 2은 2개의 문제를 맞혔습니다.
        수포자 1은 0개의 문제를 맞혔습니다.
     */
    }
}

package algorithm.week7.java1031;

public class MockExam {
    public int[] solution(int[] answer) {
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int firstStdAnswerCnt = 0;
        int secondStdAnswerCnt = 0;
        int thirdStdAnswerCnt = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == std1[i % 5]) {
                firstStdAnswerCnt++;
            }
            if (answer[i] == std2[i % 8]) {
                secondStdAnswerCnt++;
            }
            if (answer[i] == std3[i % 10]) {
                thirdStdAnswerCnt++;
            }
        }
        System.out.printf("수포자 1은 %d개 문제를 맞혔습니다.\n", firstStdAnswerCnt);
        System.out.printf("수포자 2은 %d개 문제를 맞혔습니다.\n", secondStdAnswerCnt);
        System.out.printf("수포자 3은 %d개 문제를 맞혔습니다.\n", thirdStdAnswerCnt);
        return answer;
    }

    public static void main(String[] args) {
        int[] answer1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2, 1, 3, 2, 4, 2, 1, 3, 2, 4, 2};
        MockExam mExam = new MockExam();
        mExam.solution(answer1);
        mExam.solution(answer2);
    /*
        수포자 1은 5개 문제를 맞혔습니다.
        수포자 2은 0개 문제를 맞혔습니다.
        수포자 3은 0개 문제를 맞혔습니다.
        수포자 1은 2개 문제를 맞혔습니다.
        수포자 2은 2개 문제를 맞혔습니다.
        수포자 3은 2개 문제를 맞혔습니다.
     */
    }
}

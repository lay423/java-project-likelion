package algorithm.week7.java1031;

public class MockExam {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int firstStdAnswerCnt=0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] % a[i]==0) {
                firstStdAnswerCnt++;
            }
        }


        System.out.println(firstStdAnswerCnt);
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 1번 anwer --> 5
        // 2번 anwer --> 0
        // 1번 anwer --> 5
        int[] answer = {1, 3, 2, 4, 2};
        int[] answer2 = {1, 2, 3, 4, 5};
        MockExam mExam = new MockExam();
        mExam.solution(answer2);
        mExam.solution(answer);

    }
}

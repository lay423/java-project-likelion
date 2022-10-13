package java1011.numPlus;

public class NumPlus {
    int solution(int n){
        int place = 100000000;
        int[] plusNum = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = 0;
        int j=0;
        for (int i = place; i >= 1; i /= 10) {
            if (n / i != 0) {
                plusNum[j] = n / i;
                n %= i;
                j++;
            }
        }
        for (int i : plusNum) {
            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        NumPlus numPlus = new NumPlus();

        int result = numPlus.solution(1234);

        if (result == 10) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result);
        }
    }
}

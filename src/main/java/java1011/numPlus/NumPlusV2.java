package java1011.numPlus;

public class NumPlusV2 {
    int solution(int n){
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n = n / 10;
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

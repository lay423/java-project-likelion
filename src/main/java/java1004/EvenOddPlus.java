package java1004;

import java.util.Scanner;

public class EvenOddPlus {
    public static void main(String[] args) {
    /*
        정수 두개가 입력으로 들어온다.
        만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
        그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고
        결과로 나오는 값이 홀수인지 짝수인지 출력한다.

        예를들어,
        5 7 이 입력되면 "홀수+홀수=짝수"가 출력된다.
        5 6 이 입력되면 "홀수+짝수=홀수"가 출력된다.
     */

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1+num2;
        System.out.printf("%s+%s=%s",
                getEvenOdd(num1),
                getEvenOdd(num2),
                getEvenOdd(num3));
    }

    private static String getEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else
            return "홀수";
    }

}

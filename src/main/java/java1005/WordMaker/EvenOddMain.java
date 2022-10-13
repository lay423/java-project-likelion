package java1005.WordMaker;

import java.util.Scanner;

public class EvenOddMain {
    public static void main(String[] args) {

        //정수 2개입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //각각 (English)와 (Korean)으로 return 하는 wordMaker
        WordMaker korWordMaker = new KoreanWordMaker();
        WordMaker enWordMaker = new EnglishWordMaker();

        //의존관계 주입
        EvenOdd korEvenOdd = new EvenOdd(num1, num2, korWordMaker);
        EvenOdd enEvenOdd = new EvenOdd(num1, num2, enWordMaker);

        korEvenOdd.printWord();
        enEvenOdd.printWord();
    /*
     *  *출력예시 1*
        3 4
        홀수+짝수=홀수
        Odd+Even=Odd

        *출력예시 2*
        4 6
        짝수+짝수=짝수
        Even+Even=Even
     */
    }

}

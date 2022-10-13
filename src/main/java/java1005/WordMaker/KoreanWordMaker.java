package java1005.WordMaker;

public class KoreanWordMaker implements WordMaker{
    @Override
    public String convertWord(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else
            return "홀수";
    }
}

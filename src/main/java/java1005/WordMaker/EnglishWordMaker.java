package java1005.WordMaker;

public class EnglishWordMaker implements WordMaker{
    @Override
    public String convertWord(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else
            return "Odd";
    }
}

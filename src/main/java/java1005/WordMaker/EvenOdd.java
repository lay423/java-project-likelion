package java1005.WordMaker;

public class EvenOdd {
    private int num1, num2;
    WordMaker wordMaker;

    public EvenOdd(int a, int b, WordMaker wordMaker) {
        this.num1 = a;
        this.num2 = b;
        this.wordMaker = wordMaker;
    }

    public void printWord(){
        int num3 = num1+num2;
        System.out.printf("%s+%s=%s",
                wordMaker.convertWord(num1),
                wordMaker.convertWord(num2),
                wordMaker.convertWord(num3));
        System.out.println();
    }
}

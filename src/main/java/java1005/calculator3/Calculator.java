package java1005.calculator3;

public class Calculator {

    NumberMaker numberMaker;
    int baseNum;
    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
        this.baseNum = 10;
    }

    public Calculator(NumberMaker numberMaker, int baseNum) {
        this.numberMaker = numberMaker;
        this.baseNum = baseNum;
    }

    public void plus(int a){
        System.out.println(a + numberMaker.create(10));
    }
}

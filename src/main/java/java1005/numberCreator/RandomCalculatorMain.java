package java1005.numberCreator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        NumberCreator numberCreator = new RandomNumberCreator();
        NumberCreator numberCreator1 = new SpecificNumberCreator();

        RandomCalculator randomCalculator = new RandomCalculator(2, numberCreator);
        RandomCalculator specificCalculator = new RandomCalculator(2, numberCreator1);


        randomCalculator.plus();
        randomCalculator.minus();
        randomCalculator.multiple();
        randomCalculator.divide();

        specificCalculator.plus();
        specificCalculator.minus();
        specificCalculator.multiple();
        specificCalculator.divide();
    /*
        실행결과 case1
        2 + 4 = 6
        2 - 4 = -2
        2 * 4 = 8
        2 / 4 = 0.500000
        2 + 10000 = 10002
        2 - 10000 = -9998
        2 * 10000 = 20000
        2 / 10000 = 0.000200
     */
    }
}

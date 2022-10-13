package java1005.calculator3;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberMaker(), 20);
        calculator.plus(10);
    }
}

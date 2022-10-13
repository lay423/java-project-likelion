package java1012.algorithm;

interface CalculateType {
    float getResult(int valueA, int valueB);
}

class Calculator{
    private float calculate(int valueA, int valueB, CalculateType calculateType) {
        return calculateType.getResult(valueA, valueB);
    }

    public float plus(int valueA, int valueB){
        return calculate(valueA, valueB, new CalculateType() {
            @Override
            public float getResult(int valueA, int valueB) {
                return valueA + valueB;
            }
        });
    }

    public float minus(int valueA, int valueB){
        return calculate(valueA, valueB, new CalculateType() {
            @Override
            public float getResult(int valueA, int valueB) {
                return valueA - valueB;
            }
        });
    }

    public float multiple(int valueA, int valueB) {
       return calculate(valueA, valueB, new CalculateType() {
           @Override
           public float getResult(int valueA, int valueB) {
               return valueA * valueB;
           }
       });
    }

    public float divide(int valueA, int valueB) {
        return calculate(valueA, valueB, new CalculateType() {
            @Override
            public float getResult(int valueA, int valueB) {
                return valueA / (float) valueB;
            }
        });
    }
}

public class TemplateCalculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();


        float plus = cal.plus(7, 9);
        float minus = cal.minus(7, 9);
        float multiple = cal.multiple(7, 9);
        float divide = cal.divide(7, 9);
        System.out.printf("합:%.1f, 차:%.1f, 곱:%.1f, 나누기:%.1f", plus, minus, multiple, divide);
    }
}

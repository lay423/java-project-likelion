package java1005.numberCreator;

public class RandomCalculator implements Calculator{

    private int num;
    private int random;
    private NumberCreator numberCreator;

    public RandomCalculator(int num, NumberCreator numberCreator){
        this.num = num;
        this.numberCreator = numberCreator;
        random = numberCreator.create();
    }
    public void plus(){
        System.out.printf("%d + %d = %d",
                num,
                random,
                num+random);
        System.out.println();
    }
    public void minus(){
        System.out.printf("%d - %d = %d",
                num,
                random,
                num-random);
        System.out.println();
    }
    public void multiple(){
        System.out.printf("%d * %d = %d",
                num,
                random,
                num*random);
        System.out.println();
    }
    public void divide(){
        try{
            float result = num/random;
            System.out.printf("%d / %d = %f",
                    num,
                    random,
                    (float)num/random);
        }catch (ArithmeticException e){
            System.out.printf("%d / %d 오류발생",
                    num,
                    random);
        }


        System.out.println();
    }
}

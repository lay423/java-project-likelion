package algorithm.week3.java1005.numberCreator;

public class RandomNumberCreator implements NumberCreator{

    @Override
    public int create() {
        return (int)(Math.random()*10);
    }
}

package algorithm.week3.java1006.setNum;


public class RandomNumberCreator implements NumberCreator{

    public int create(int num) {
        return (int)(Math.random()*num);
    }
}

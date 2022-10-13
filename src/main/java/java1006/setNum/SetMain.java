package java1006.setNum;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        RndNumbersWithoutDuplicated rnwd = new RndNumbersWithoutDuplicated(100);
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        Set<Integer> set1 = new HashSet<>();
        set1 = rnwd.getRndNumWitoutDupl();
        System.out.println(set1);
        System.out.println(set1.size());
    }
}

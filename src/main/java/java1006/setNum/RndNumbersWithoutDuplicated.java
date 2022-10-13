package java1006.setNum;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
    int[] arr = new int[10];
    Set<Integer> set1 = new HashSet<>();
    public RndNumbersWithoutDuplicated(int num) {
        this.arr = new int[num];
        this.set1 = new HashSet<>();
    }

    public Set<Integer> getRndNumWitoutDupl(){
        for(int i=0; i<arr.length; i++){
            arr[i] = randomNumberCreator.create(50);
            set1.add(arr[i]);
        }
        return set1;
    }



}

package algorithm.week7.java1102;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 2; i < 50; i++) {
            integers.add(i);
        }

        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0) {
                integers.remove(i);
            }
        }
        System.out.println(integers.size());

        for (int i = 2; i < integers.size(); i++) {
            if (integers.get(i) % 3 == 0) {
                integers.remove(i);
            }
        }

        System.out.println(integers.size());

    }
}

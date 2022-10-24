package algorithm.week6.java1024;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        double[] value = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            value[i] = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            double k = 1000;
            while (k > 1) {
                if (value[i] / k >= 1) {
                    value[i] = numbers[i] / k;
                    value[i]-=1/k;
                }
                k = k/10;
            }
        }
        int[] idx = new int[value.length];

        for (int i = 0; i < value.length; i++) {
            idx[i] = i;
        }

        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] < value[j]) {
                    double tmp = value[i];
                    value[i] = value[j];
                    value[j] = tmp;
                    int itmp = idx[i];
                    idx[i] = idx[j];
                    idx[j] = itmp;
                }
            }
        }

        for (int i = 0; i < value.length; i++) {
            answer += numbers[idx[i]];
        }

        return answer;
    }

    public String solution1(int[] numbers) {
        String answer="";


        return answer;
    }

    public static void main(String[] args) {
        MaxNum maxNum = new MaxNum();
        int[] arr = {6, 10, 2};
        int[] arr1 = {3, 300, 34, 5, 9};
        int[] arr2 = {979, 97, 978, 81, 818, 817};
//        String s = maxNum.solution(arr);
//        System.out.println(s);
//        s = maxNum.solution(arr1);
//        System.out.println(s);
        String s = maxNum.solution(arr2);
        System.out.println(s);
        Assertions.assertEquals(s, "9799797881881817");
    }
}

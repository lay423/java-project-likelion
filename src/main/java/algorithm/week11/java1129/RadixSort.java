package algorithm.week11.java1129;

import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[] arr){
        int[] idx = new int[10];
        Arrays.fill(idx, -1);
        for (int i : arr) {
            idx[i] = i;
        }
        int j=0;
        for (int i = 0; i < idx.length; i++) {
            if (idx[i] != -1) {
                arr[j]=idx[i];
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}

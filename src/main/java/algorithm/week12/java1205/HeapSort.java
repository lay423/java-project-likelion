package algorithm.week12.java1205;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

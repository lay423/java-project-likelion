package algorithm.week8.java1109;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i=0;
        for (int j = i; j < arr.length; j++) {
            int minIdx = i;
            if (arr[minIdx] > arr[j]) {
                minIdx = j;
            }
            int tmp=arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
        System.out.println((i+1)+"번째 "+Arrays.toString(arr));
        i=1;
        for (int j = i; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                int tmp=arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        System.out.println((i+1)+"번째 "+Arrays.toString(arr));
        i=2;

        i=3;
    }
}

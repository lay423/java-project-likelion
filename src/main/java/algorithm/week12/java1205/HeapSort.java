package algorithm.week12.java1205;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public int[] getChildrenIdx(int parentIdx) {
        int lefIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        return new int[]{lefIdx, rightIdx};
    }

    public int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 8};
        int tmp;
        tmp = arr[3];
        arr[3] = arr[1];
        arr[1] = tmp;

        tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }
}

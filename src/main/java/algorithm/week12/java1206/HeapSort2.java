package algorithm.week12.java1206;

import java.util.Arrays;

public class HeapSort2 {
    public int[] getChildrenIdx(int parentIdx) {
        int lefIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        return new int[]{lefIdx, rightIdx};
    }

    public static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        if (leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        if (rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        if(parentIdx != greaterIdx){
            int tmp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = tmp;
            makeHeap(arr, greaterIdx, arrSize);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7};
        arr = new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1};
        for (int i = (arr.length-2)/2; i >=0; i--) {
            arr = makeHeap(arr, i, arr.length);
            System.out.println(Arrays.toString(arr));
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[arr.length-1] = temp;
            arr = makeHeap(arr, 0, i);
            System.out.println(Arrays.toString(arr));

        }
    }
}

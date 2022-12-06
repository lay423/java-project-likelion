package algorithm.week12.java1206;

import java.util.Arrays;

public class HeapSort2 {
    public int[] getChildrenIdx(int parentIdx) {
        int lefIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        return new int[]{lefIdx, rightIdx};
    }

    public static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        if(parentIdx != greaterIdx){
            int tmp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = tmp;
            makeHeap(arr, greaterIdx);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7};
        arr = new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1};
        for (int i = (arr.length-2)/2; i >=0; i--) {
            arr = makeHeap(arr, i);
            System.out.println(Arrays.toString(arr));
        }


    }
}

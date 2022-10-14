package java1014.sort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        int targetVal;
        int targetIdx;

        for (int i = 1; i < arr.length; i++) {
            targetVal = arr[i];
            targetIdx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (targetVal < arr[j]) {
                    arr[targetIdx] = arr[j];
                    arr[j] = targetVal;
                    targetIdx = j;
                }
            }

            //회전과정 출력
            System.out.print(i + "회전 : ");
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {8, 5, 6, 2, 4};
        System.out.println(Arrays.toString(arr));

        int[] result = insertionSort.sort(arr);
        System.out.println(Arrays.toString(result));
    /*
        [8, 5, 6, 2, 4]
        1회전 : [5, 8, 6, 2, 4]
        2회전 : [5, 6, 8, 2, 4]
        3회전 : [2, 5, 6, 8, 4]
        4회전 : [2, 4, 5, 6, 8]
        [2, 4, 5, 6, 8]
    */
    }
}

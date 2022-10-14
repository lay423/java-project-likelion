package java1014.sort;

import java.util.Arrays;

public class InsertionSort2 {
    public int[] sort(int[] arr, int n) {
        int targetVal;
        int targetIdx;
        int j = n;

        if (arr[j] < arr[j - 1]) {
            int tmp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort2 insertionSort = new InsertionSort2();

        int[] arr = {8, 5, 6, 2, 4};
        System.out.println(Arrays.toString(arr));

        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = insertionSort.sort(arr, 2);
        System.out.println(Arrays.toString(result));
    /*
        [8, 5, 6, 2, 4]
        [5, 8, 6, 2, 4]
    */
    }
}

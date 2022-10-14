package java1014.sort;

import java.util.Arrays;

public class InsertionSort2 {
    public int[] sort(int[] arr) {
        int targetVal;
        int targetIdx;
        int i=1;

        if (arr[i] < arr[i - 1]) {
            int tmp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort2 insertionSort = new InsertionSort2();

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

package algorithm.week8.java1109;

import java.util.Arrays;

interface SortStrategy{
    boolean sortType(int a, int b);
}

public class SelectionSort {

    public int[] sort(int[] arr, SortStrategy strategy) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (strategy.sortType(arr[minIdx], arr[j])) minIdx = j;
            }
            int tmp=arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;

            System.out.println((i+1)+"번째 "+Arrays.toString(arr));
        }

        return arr;
    }


    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        //오름차순
        int[] sortedArr = ss.sort(arr, (a,b)-> a>b);

        //내림차순
        sortedArr = ss.sort(arr, (a,b)-> a<b);



    }
}

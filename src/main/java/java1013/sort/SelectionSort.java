package java1013.sort;

public class SelectionSort {

    public int[] selcSort(int[] arr) {
        int targetVal;
        int targetIdx;
        for (int i = 0; i < arr.length - 1; i++) {
            targetVal = arr[i];
            targetIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (targetVal > arr[j]) {
                    targetIdx = j;
                    targetVal = arr[j];
                }

            }
            int tmp = targetVal;
            arr[targetIdx] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {2, 7, 3, 9, 28, 1};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        arr = selectionSort.selcSort(arr); //1은 오름차순, 2는 내림차순
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

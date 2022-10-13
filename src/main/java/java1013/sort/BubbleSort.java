package java1013.sort;


public class BubbleSort {

    public int[] bubbSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {2, 7, 3, 9, 28, 1};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        arr = bubbleSort.bubbSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


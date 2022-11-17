package algorithm.week9.java1117;

public class QuickSort {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[arr.length / 2];
        while (arr[startIdx] < pivot) {
            startIdx += 1;
        }
        while(arr[endIdx]> pivot) endIdx -= 1;

        int tmp = arr[endIdx];
        arr[startIdx] = arr[endIdx];
        arr[endIdx] = tmp;
        startIdx+=1;
        endIdx-=1;
        return arr;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{20, 18, 5, 19, 40, 25, 5, 50};
        int startIdx = 0;
        int endIdx = arr.length-1;
        int[] sortedArr = qs.sort(arr, startIdx, endIdx);
    }
}

package algorithm.week8.java1108;

public class BinarySearch {

    public String search(int[] arr, int target) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        while (startIdx - endIdx != 0) {
            int midIdx = (endIdx - startIdx)/2;
            System.out.println(midIdx);
            if (arr[midIdx] > target) endIdx = midIdx;
            else if (arr[midIdx] < target) startIdx = midIdx;
            else {
                return "else문 도달 midIdx 값: " + arr[midIdx];
            }
            System.out.printf("%d %d %d", startIdx, midIdx, endIdx);

        }
        if (arr[startIdx] == target) {
            return "target이 존재함 startIdx: " + startIdx;
        }

        return "존재하지 않음 startIdx: " + startIdx;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 8;
        System.out.println(bs.search(arr, target));
    }
}
